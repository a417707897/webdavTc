package cn.luckylin.webdav.config;



import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Configuration
public class RestTemplateConfig {



    @Bean
    public RestTemplate restTemplate(){
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory(HttpClientBuilder.create()
                .setMaxConnTotal(20)
                .setMaxConnPerRoute(20)
                .build());
        httpRequestFactory.setConnectionRequestTimeout(10000);
        httpRequestFactory.setConnectTimeout(10000);
        httpRequestFactory.setReadTimeout(10000);

        RestTemplate restTemplate = new RestTemplate(httpRequestFactory);

        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        for (int i = 0; i < messageConverters.size(); i++) {
            if (messageConverters.get(i) instanceof StringHttpMessageConverter) {
                //切换
                messageConverters.set(i,new StringHttpMessageConverter(StandardCharsets.UTF_8));
            }

//            if (messageConverters.get(i) instanceof MappingJackson2HttpMessageConverter) {
//                MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//                // Note: here we are making this converter to process any kind of response,
//                // not only application/*json, which is the default behaviour
//                converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
//                messageConverters.set(i,converter);
//            }
        }
        return restTemplate;
    }

    /*
     * @Author zyl
     * @Description 获取新的rest实例
     * @Date 2021/1/14 14:54
     * @Param []
     * @return org.springframework.web.client.RestTemplate
     **/
    public static synchronized RestTemplate getRestTemplateStringIsUtf8(){
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory(HttpClientBuilder.create()
                .setMaxConnTotal(100)
                .setMaxConnPerRoute(100)
                .build());
        httpRequestFactory.setConnectionRequestTimeout(10000);
        httpRequestFactory.setConnectTimeout(10000);
        httpRequestFactory.setReadTimeout(10000);

        RestTemplate restTemplate = new RestTemplate(httpRequestFactory);

        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        for (int i = 0; i < messageConverters.size(); i++) {
            if (messageConverters.get(i) instanceof StringHttpMessageConverter) {
                //切换
                messageConverters.set(i,new StringHttpMessageConverter(StandardCharsets.UTF_8));
            }
        }
        return restTemplate;
    }
}
