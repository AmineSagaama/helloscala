package com.asagaama

import org.scalatest.FunSuite

/**
  * Created by asagaama on 08/01/2017.
  */
class HelloTests extends FunSuite {

  test("displaySalutation returns 'Hello World'") {

    assert(Hello.displaySalutation == "Hello World")
  }

}
