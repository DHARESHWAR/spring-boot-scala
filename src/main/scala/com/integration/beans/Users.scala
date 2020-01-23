package com.integration.beans

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotNull

@SerialVersionUID(7876879811111L)
class Users extends Serializable {

  @NotNull(message = "Name can't be black")
  @JsonProperty("Name")
  var name: String = _

  @NotNull(message = "Phone can't be black")
  @JsonProperty("Phone")
  var phone: String = _

  @NotNull(message = "Address can't be black")
  @JsonProperty("Address")
  var address: String = _

  /*
  Add few more fields
   */
}
