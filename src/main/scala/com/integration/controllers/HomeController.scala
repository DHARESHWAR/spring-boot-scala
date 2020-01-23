package com.integration.controllers

import com.integration.beans.Users
import com.integration.constants.Properties
import javax.servlet.http.HttpServletResponse
import javax.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestBody, RequestMapping, ResponseBody, RestController}

@RequestMapping(path = Array("/users"))
@RestController
class HomeController {

  /*
      If you want to autowire service or component as we do in spring-boot,
      mention those in constructor like below

    class HomeController(@Autowired val userService: UserService,
                         @Autowired val anotherService: AnotherService) {
   */


  @Autowired
  private var properties: Properties = _

  //Health check api
  @GetMapping(path = Array("/"))
  def demo: String = {
    "Welcome to Janus executor engine."
  }

  @GetMapping(path = Array("/get-all"))
  @ResponseBody
  def getUsers(response: HttpServletResponse): Unit = {
    println(properties.PROJECT_DESCRIPTION)
    /*
      Add your Business Login
    */
    response.setStatus(HttpStatus.OK.value())
    response.getWriter.println("users")
    response.getWriter.flush()
    response.getWriter.close()
  }


  /*
    Put and Post request are almost same except @PutMapping annotation instead of @PostMapping
   */

  @PostMapping(path = Array("/add"))
  def addUsers(@Valid @RequestBody user: Users, response: HttpServletResponse): Unit = {
    /*
    Add your Business Login
  */
    response.setStatus(HttpStatus.OK.value())
    response.getWriter.println("Added Successfully")
    response.getWriter.flush()
    response.getWriter.close()
  }

}
