package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaKeyAlgorithm extends KeyAlgorithm {
  var modulusLength: Double
  var publicExponent: BigInteger
}

object RsaKeyAlgorithm {
  @scala.inline
  def apply(modulusLength: Double, name: java.lang.String, publicExponent: BigInteger): RsaKeyAlgorithm = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength, name = name, publicExponent = publicExponent)
  
    __obj.asInstanceOf[RsaKeyAlgorithm]
  }
}

