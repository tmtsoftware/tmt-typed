package typings.std

import typings.std.stdStrings.focus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_focus extends js.Object {
  def apply(`type`: focus, listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]): Unit = js.native
  def apply(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}
