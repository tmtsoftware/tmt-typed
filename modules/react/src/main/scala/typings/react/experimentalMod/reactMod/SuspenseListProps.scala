package typings.react.experimentalMod.reactMod

import typings.react.reactMod.ReactElement
import typings.react.reactStrings.backwards
import typings.react.reactStrings.forwards
import typings.std.Exclude
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.react.experimentalMod.reactMod.DirectionalSuspenseListProps
  - typings.react.experimentalMod.reactMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends js.Object

object SuspenseListProps {
  @scala.inline
  def DirectionalSuspenseListProps(
    children: ReactElement | Iterable[ReactElement],
    revealOrder: forwards | backwards,
    tail: SuspenseListTailMode = null
  ): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
  @scala.inline
  def NonDirectionalSuspenseListProps(
    children: ReactElement | Iterable[ReactElement],
    revealOrder: Exclude[SuspenseListRevealOrder, forwards | backwards] = null
  ): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
}

