package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaKeyGenParams extends Algorithm {
  var modulusLength: Double
  var publicExponent: BigInteger
}

object RsaKeyGenParams {
  @scala.inline
  def apply(modulusLength: Double, name: java.lang.String, publicExponent: BigInteger): RsaKeyGenParams = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength, name = name, publicExponent = publicExponent)
  
    __obj.asInstanceOf[RsaKeyGenParams]
  }
}

