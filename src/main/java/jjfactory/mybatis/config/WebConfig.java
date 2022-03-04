package jjfactory.mybatis.config;

import jjfactory.mybatis.config.interceptor.RoleInterceptor;
import jjfactory.mybatis.config.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionInterceptor())
                .addPathPatterns("/user/**")
                .addPathPatterns("/board/**")
                .addPathPatterns("/board**");

        registry.addInterceptor(new RoleInterceptor())
                .addPathPatterns("/admin/**");
    }
}
