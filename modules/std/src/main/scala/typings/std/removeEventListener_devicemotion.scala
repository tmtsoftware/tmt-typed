package typings.std

import typings.std.stdStrings.devicemotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_devicemotion extends js.Object {
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ DeviceMotionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ DeviceMotionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

