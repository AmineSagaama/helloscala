package com.asagaama

import org.scalatest.FlatSpec

/**
  * Created by asagaama on 08/01/2017.
  */
class BinaryToDecimalSpec extends FlatSpec {

  "base conversion utility" should "convert binary number 100100111101 to decimal equivalent 2365" in {
    val decimal: Decimal = BaseConversion.binaryToDecimal(Binary("100100111101"))
    assert(decimal.number == "2365")
  }

  it should "convert binary number 11110001111110111 to decimal equivalent 123895" in {
    val decimal: Decimal = BaseConversion.binaryToDecimal(Binary("11110001111110111"))
    assert(decimal.number == "123895")
  }

}
