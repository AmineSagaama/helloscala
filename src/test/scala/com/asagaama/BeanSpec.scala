package com.asagaama

import org.scalatest.FlatSpec

/**
  * Created by asagaama on 08/01/2017.
  */
class BeanSpec extends FlatSpec {

  "Decimal" should "throw error when initalised with a non numeric string" in {
    try {
      Decimal("XYZ")
    } catch {
      case e: IllegalArgumentException => assert(e.getMessage == "requirement failed: Unable to convert string to number")
      case _ => fail
    }
  }

  "Binary" should "throw error when initalised with a non numeric string" in {
    intercept[IllegalArgumentException] {
      Binary("XYZ")
    }
  }

}
