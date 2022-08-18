package cn.luckylin.webdav.bilibili;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.Resource;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HtmlUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.luckylin.webdav.entity.PlayurlDto;
import cn.luckylin.webdav.util.UserAgentUtil;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.jsoup.Jsoup;

import javax.lang.model.SourceVersion;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        try {
            String spUrl = "https://www.bilibili.com/video/BV1EG411h7bu?spm_id_from=333.337.search-card.all.click&vd_source=31e776caad8cd7ca83426af43fd6a4d1";

            String html = Jsoup
                    .connect(spUrl)
                    .userAgent(UserAgentUtil.getPC())
                    .ignoreContentType(true)
                    .execute()
                    .body();
            String jsonStr = regexJson(html);

            JSONObject entries = JSONUtil.parseObj(jsonStr);


            String url = "https://api.bilibili.com/x/player/playurl?cid={}&bvid={}&otype=json&qn=112";
            JSONObject videoData = entries.getJSONObject("videoData");
            url = StrUtil.format(url, videoData.getStr("cid"), videoData.getStr("bvid"));

            Map<String, List<String>> h = new HashMap<>();
            h.put("user-agent", Arrays.asList(UserAgentUtil.getPC()));
            h.put("referer", Arrays.asList(spUrl));
            h.put("cookie", Arrays.asList(""));

            HttpResponse execute = HttpRequest.get(url).header(h).execute();
            String body = execute.body();

            PlayurlDto playurlDto = JSONUtil.toBean(body, PlayurlDto.class);

            String url1 = playurlDto.getData().getDurl().get(0).getUrl();

            h.put("referer", Arrays.asList(StrUtil.format("https://www.bilibili.com/video/av{}/", videoData.get("aid"))));

            execute = HttpRequest.get(url1).header(h).execute();

            InputStream inputStream = execute.bodyStream();

            String fileName = StrUtil.format("E:/FFOutput/{}.flv", videoData.getStr("title"));
            FileUtil.writeFromStream(inputStream, new File(fileName));

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 方法描述: 正则获取数据json
     *
     * @param html 网页内容
     */
    /**
     * 方法描述: 正则获取数据json
     *
     * @param html 网页内容
     */
    public static String regexJson(String html) {
        // 匹配网址
        String regex = "window.__INITIAL_STATE__=\\{(.*?)\\};";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(html);
        if (m.find()) {
            return html.substring(m.start(), m.end())
                    .replace("window.__INITIAL_STATE__=", "")
                    .replace(";", "");
        }
        return "";
    }


    //取中间方法
    public static String sj(String str, String start, String end) {
        if (str.contains(start) && str.contains(end)) {
            str = str.substring(str.indexOf(start) + start.length());
            return str.substring(0, str.indexOf(end));
        }
        return "";
    }
}
