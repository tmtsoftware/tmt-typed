package typings.std.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDescriptor extends js.Object {
  var element: TableKind
  var initial: Double
  var maximum: js.UndefOr[Double] = js.undefined
}

object TableDescriptor {
  @scala.inline
  def apply(element: TableKind, initial: Double, maximum: Int | Double = null): TableDescriptor = {
    val __obj = js.Dynamic.literal(element = element, initial = initial)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDescriptor]
  }
}

