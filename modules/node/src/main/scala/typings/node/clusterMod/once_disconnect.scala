package typings.node.clusterMod

import typings.node.nodeStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "once")
@js.native
object once_disconnect extends js.Object {
  def apply(event: disconnect, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
}
