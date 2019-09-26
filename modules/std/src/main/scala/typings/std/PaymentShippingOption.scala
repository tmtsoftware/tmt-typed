package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentShippingOption extends js.Object {
  var amount: PaymentCurrencyAmount
  var id: java.lang.String
  var label: java.lang.String
  var selected: js.UndefOr[scala.Boolean] = js.undefined
}

object PaymentShippingOption {
  @scala.inline
  def apply(
    amount: PaymentCurrencyAmount,
    id: java.lang.String,
    label: java.lang.String,
    selected: js.UndefOr[scala.Boolean] = js.undefined
  ): PaymentShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount, id = id, label = label)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PaymentShippingOption]
  }
}

