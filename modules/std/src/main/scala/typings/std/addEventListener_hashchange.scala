package typings.std

import typings.std.stdStrings.hashchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_hashchange extends js.Object {
  def apply(`type`: hashchange, listener: js.ThisFunction1[/* this */ Window_, /* ev */ HashChangeEvent, _]): Unit = js.native
  def apply(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ HashChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

