package cn.luckylin.webdav.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class WebDavConfig {

    @Value("${webdav.url}")
    private String url;

    @Value("${webdav.path}")
    private String savePath;

    @Value("${webdav.requestPath}")
    private String requestPath;

    @Value("${webdav.username}")
    private String username;

    @Value("${webdav.password}")
    private String password;

    public String getUrl() {
        return url;
    }

    public String getSavePath() {
        return savePath;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
