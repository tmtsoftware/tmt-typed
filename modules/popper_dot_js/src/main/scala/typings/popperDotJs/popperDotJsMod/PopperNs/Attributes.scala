package typings.popperDotJs.popperDotJsMod.PopperNs

import typings.popperDotJs.popperDotJsNumbers.`false`
import typings.popperDotJs.popperDotJsStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var `x-out-of-boundaries`: Empty | `false`
  var `x-placement`: typings.popperDotJs.popperDotJsMod.PopperNs.Placement
}

object Attributes {
  @scala.inline
  def apply(
    `x-out-of-boundaries`: Empty | `false`,
    `x-placement`: typings.popperDotJs.popperDotJsMod.PopperNs.Placement
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-out-of-boundaries")(`x-out-of-boundaries`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-placement")(`x-placement`)
    __obj.asInstanceOf[Attributes]
  }
}

