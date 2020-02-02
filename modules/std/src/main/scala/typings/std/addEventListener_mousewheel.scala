package typings.std

import typings.std.stdStrings.mousewheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_mousewheel extends js.Object {
  def apply(`type`: mousewheel, listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _]): Unit = js.native
  def apply(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

