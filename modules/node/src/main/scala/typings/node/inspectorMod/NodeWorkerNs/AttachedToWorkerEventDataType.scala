package typings.node.inspectorMod.NodeWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachedToWorkerEventDataType extends js.Object {
  /**
    * Identifier assigned to the session used to send/receive messages.
    */
  var sessionId: SessionID
  var waitingForDebugger: Boolean
  var workerInfo: WorkerInfo
}

object AttachedToWorkerEventDataType {
  @scala.inline
  def apply(sessionId: SessionID, waitingForDebugger: Boolean, workerInfo: WorkerInfo): AttachedToWorkerEventDataType = {
    val __obj = js.Dynamic.literal(sessionId = sessionId, waitingForDebugger = waitingForDebugger, workerInfo = workerInfo)
  
    __obj.asInstanceOf[AttachedToWorkerEventDataType]
  }
}

