package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// color.js
trait ColorLike extends js.Object {
  var b: Double
  var g: Double
  var r: Double
}

object ColorLike {
  @scala.inline
  def apply(b: Double, g: Double, r: Double): ColorLike = {
    val __obj = js.Dynamic.literal(b = b, g = g, r = r)
  
    __obj.asInstanceOf[ColorLike]
  }
}
