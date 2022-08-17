package cn.luckylin.webdav;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.img.Img;
import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.crypto.digest.MD5;
import cn.luckylin.webdav.config.WebDavConfig;
import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;

@RestController
public class WebDavController {

    @Autowired
    private WebDavConfig webDavConfig;

    @PostMapping("/put")
    public Map<String, String> upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {

        Map<String, String> result = new HashMap<>();

        Sardine begin = SardineFactory.begin(webDavConfig.getUsername(), webDavConfig.getPassword());

        try {

            //判断路径是否存在
            String path = webDavConfig.getUrl() + webDavConfig.getSavePath();

            byte[] bytes = file.getBytes();
            StringBuffer sb = new StringBuffer();
            sb.append(UUID.randomUUID().toString().replace("-", ""))
                    .append(".")
                    .append(FileUtil.getSuffix(file.getOriginalFilename()));

            begin.put(path + "/" + sb.toString(), bytes);
            result.put("result", "0");
            result.put("url", webDavConfig.getRequestPath()  + webDavConfig.getSavePath() + "/" + sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
            result.put("result", "1");
        }

        return result;

    }

}
