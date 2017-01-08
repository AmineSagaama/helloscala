package com.asagaama

import scala.annotation.tailrec

/**
  * Created by asagaama on 08/01/2017.
  */
object BaseConversion {

  /**
    *
    * @param binary
    * @return
    */
  def binaryToDecimal(binary: Binary) = {
    val seq = binary.number.reverse.zipWithIndex.map { case (a, i) => a.toString.toInt * math.pow(2, i) }
    Decimal(seq.sum.toInt.toString)
  }

  /**
    *
    * @param decimal
    * @return
    */
  def decimalToBinary(decimal: Decimal) = {
    Binary(toBinary(BigInt(decimal.number), "").toString)
  }

  @tailrec private def toBinary(num: BigInt, acc: String): String = {
    if (num < 2) num.toString + acc
    else toBinary(num / 2, (num mod 2).toString ++ acc)
  }


}
