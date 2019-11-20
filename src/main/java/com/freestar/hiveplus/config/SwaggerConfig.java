package com.freestar.hiveplus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

import static com.freestar.hiveplus.common.CommonConstant.ROOT_PACKAGE_NAME;


//swagger配置教程 https://www.ibm.com/developerworks/cn/java/j-using-swagger-in-a-spring-boot-project/index.html
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
//                .ignoredParameterTypes(AuthenticationPrincipal.class)
//                .directModelSubstitute(Long.class, String.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage(ROOT_PACKAGE_NAME))
                .paths(PathSelectors.any())
                .build()
//                .securitySchemes(securitySchemes())
                .apiInfo(apiInfo())
//                .securityContexts(securityContexts())
                ;
    }

    private List<ApiKey> securitySchemes() {
        ArrayList<ApiKey> list = new ArrayList<>();
        list.add(new ApiKey("Authorization", "Authorization", "header"));
        return list;
    }

    private List<SecurityContext> securityContexts() {
        ArrayList<SecurityContext> list = new ArrayList<>();
        list.add(SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("^(?!auth).*$"))
                .build());

        return list;
    }

    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;

        ArrayList<SecurityReference> list = new ArrayList<>();
        list.add(new SecurityReference("Authorization", authorizationScopes));
        return list;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Springboot脚手架")
                .description("请求参数 $date-time 格式：2019-12-02 00:00:00   $date 格式：2019-02-02\n" +
                        "用户登录后会返回 token ，需要在后面的接口请求中加入 token 验证 Authorization  Bearer ")
                //服务条款网址
                .version("1.0")
                .build();
    }
}