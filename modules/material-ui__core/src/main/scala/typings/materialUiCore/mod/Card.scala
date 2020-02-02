package typings.materialUiCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.materialUiCore.cardCardMod.CardProps
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core", "Card")
@js.native
class Card protected ()
  extends Component[CardProps, ComponentState, js.Any] {
  def this(props: CardProps) = this()
  def this(props: CardProps, context: js.Any) = this()
}

@JSImport("@material-ui/core", "Card")
@js.native
object Card extends TopLevel[ComponentType[CardProps]]

