package com.integration.constants

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class Properties {

  @Value(value = "${spring.application.description}")
  var PROJECT_DESCRIPTION: String = _
}
