package cn.fxbin.original.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CorsConfig
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:26
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    // Access-Control-Allow-Methods：真实请求允许的方法。
    // Access-Control-Allow-Headers：服务器允许使用的字段。
    // Access-Control-Allow-Credentials：是否允许用户发送、处理cookie。
    // Access-Control-Max-Age：预检请求的有效期，单位为秒。有效期内，不会重复发送预检请求。

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE")
                .maxAge(168000)
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
