package com.ylw.springcloud.eureka.a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                // api扫包
                .apis(RequestHandlerSelectors.basePackage("com.ylw.springcloud.eureka.a")).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("A项目学生信息管理系统").description("对学生信息进行管理")
                .termsOfServiceUrl("http://www.xxx.com")
                // .contact(contact)
                .version("2.0").build();
    }

}
