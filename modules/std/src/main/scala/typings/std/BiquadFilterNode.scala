package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers. */
@js.native
trait BiquadFilterNode extends AudioNode {
  val Q: AudioParam = js.native
  val detune: AudioParam = js.native
  val frequency: AudioParam = js.native
  val gain: AudioParam = js.native
  var `type`: BiquadFilterType = js.native
  def getFrequencyResponse(frequencyHz: Float32Array, magResponse: Float32Array, phaseResponse: Float32Array): Unit = js.native
}

@JSGlobal("BiquadFilterNode")
@js.native
object BiquadFilterNode
  extends Instantiable1[/* context */ BaseAudioContext, BiquadFilterNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ BiquadFilterOptions, BiquadFilterNode]

