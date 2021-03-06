package typings.std

import typings.std.stdStrings.deviceorientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_deviceorientation extends js.Object {
  def apply(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ DeviceOrientationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ DeviceOrientationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

