package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackTraceReturnType extends js.Object {
  var stackTrace: StackTrace
}

object GetStackTraceReturnType {
  @scala.inline
  def apply(stackTrace: StackTrace): GetStackTraceReturnType = {
    val __obj = js.Dynamic.literal(stackTrace = stackTrace)
  
    __obj.asInstanceOf[GetStackTraceReturnType]
  }
}
