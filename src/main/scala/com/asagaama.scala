package com

/**
  * Created by asagaama on 08/01/2017.
  */
package object asagaama {

  trait Number {
    def number: String

    require(number forall Character.isDigit, "Unable to convert string to number")
  }

  case class Decimal(number: String) extends Number

  case class Binary(number: String) extends Number

}
