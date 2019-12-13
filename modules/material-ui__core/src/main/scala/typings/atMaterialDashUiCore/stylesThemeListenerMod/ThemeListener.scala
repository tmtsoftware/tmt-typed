package typings.atMaterialDashUiCore.stylesThemeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeListener[S] extends js.Object {
  def initial(context: MuiContext[S]): S | Null
  def subscribe(context: MuiContext[S], callback: js.Function1[/* state */ S, Unit]): Double | Null
  def unsubscribe(context: MuiContext[S], subscriptionId: Double): Unit
}

object ThemeListener {
  @scala.inline
  def apply[S](
    initial: MuiContext[S] => S | Null,
    subscribe: (MuiContext[S], js.Function1[/* state */ S, Unit]) => Double | Null,
    unsubscribe: (MuiContext[S], Double) => Unit
  ): ThemeListener[S] = {
    val __obj = js.Dynamic.literal(initial = js.Any.fromFunction1(initial), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[ThemeListener[S]]
  }
}

