package typings.std

import typings.std.stdStrings.pageshow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pageshow extends js.Object {
  def apply(`type`: pageshow, listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]): Unit = js.native
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

