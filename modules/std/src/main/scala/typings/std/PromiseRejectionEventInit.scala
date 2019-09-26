package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseRejectionEventInit extends EventInit {
  var promise: js.Promise[_]
  var reason: js.UndefOr[js.Any] = js.undefined
}

object PromiseRejectionEventInit {
  @scala.inline
  def apply(
    promise: js.Promise[_],
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    reason: js.Any = null
  ): PromiseRejectionEventInit = {
    val __obj = js.Dynamic.literal(promise = promise)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[PromiseRejectionEventInit]
  }
}

