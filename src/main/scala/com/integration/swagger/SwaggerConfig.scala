package com.integration.swagger

import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import springfox.documentation.builders.{PathSelectors, RequestHandlerSelectors}
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@EnableWebMvc
class SwaggerConfig {

  @Bean
  def api(): Docket = {
    new Docket(DocumentationType.SWAGGER_2)
      .select
      .apis(RequestHandlerSelectors.basePackage("com.integration"))
      .paths(PathSelectors.any)
      .build
  }
}
