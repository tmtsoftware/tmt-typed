package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInit extends js.Object {
  var bubbles: js.UndefOr[scala.Boolean] = js.undefined
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  var composed: js.UndefOr[scala.Boolean] = js.undefined
}

object EventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): EventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[EventInit]
  }
}

