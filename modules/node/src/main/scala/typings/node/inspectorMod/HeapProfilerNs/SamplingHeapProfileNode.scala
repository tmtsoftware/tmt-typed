package typings.node.inspectorMod.HeapProfilerNs

import typings.node.inspectorMod.RuntimeNs.CallFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sampling Heap Profile node. Holds callsite information, allocation statistics and child nodes.
  */
trait SamplingHeapProfileNode extends js.Object {
  /**
    * Function location.
    */
  var callFrame: CallFrame
  /**
    * Child nodes.
    */
  var children: js.Array[SamplingHeapProfileNode]
  /**
    * Allocations size in bytes for the node excluding children.
    */
  var selfSize: Double
}

object SamplingHeapProfileNode {
  @scala.inline
  def apply(callFrame: CallFrame, children: js.Array[SamplingHeapProfileNode], selfSize: Double): SamplingHeapProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame, children = children, selfSize = selfSize)
  
    __obj.asInstanceOf[SamplingHeapProfileNode]
  }
}

