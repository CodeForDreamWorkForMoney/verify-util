package pao.hui.util.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @PackageName: pao.hui.util.config
 * @Description:
 * @author: 韩超
 * @date: 2020/7/14
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment){

        /**
         * 设置能调用接口文档的环境，一般为开发、测试环境
         */
        Profiles profiles = Profiles.of("dev","test");

        boolean b = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo())
                .groupName("HanChao的接口文档")
                .enable(b)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build()
                ;

    }

    private ApiInfo apiInfo(){

        Contact contact = new Contact("HanChao","http://www.baidu.com","xinqianhan@icloud.com");

        return new ApiInfo(
                "swagger文档自动生成",
                "多学总没有坏处",
                "v1.0",
                "xinqianhan@icloud.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/License-2.0",
                new ArrayList<>()
        );
    }
}
