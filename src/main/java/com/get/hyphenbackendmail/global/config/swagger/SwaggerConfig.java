package com.get.hyphenbackendmail.global.config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Hyphen Mail API Doc",
                description = "This is Hyphen mail API document.",
                version = "v1.0.0",
//                license = @License(
//                        name = "Apache License Version 2.0",
//                        url = "http://www.apache.org/licenses/LICENSE-2.0"
//                ),
                license = @License(
                        name = "MIT License",
                        url = "https://opensource.org/licenses/MIT"
                ),
                contact = @Contact(
                        name = "GET team"
                )
        ),
        tags = {
                @Tag(name = "MailController", description = "<b>[메일]</b> 인증 API")
        }
)
@Configuration
public class SwaggerConfig {

}
