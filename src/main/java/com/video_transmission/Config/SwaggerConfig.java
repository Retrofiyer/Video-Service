package com.video_transmission.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Api Rest Video Streaming",
                version = "1.0",
                description = "This is api rest for Upload Videos"
        )
)
public class SwaggerConfig {
}
