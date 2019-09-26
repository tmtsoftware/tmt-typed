package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects. */
@js.native
trait CSSRuleList extends /* index */ NumberDictionary[CSSRule] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSRule]] = js.native
  val length: Double = js.native
  def item(index: Double): CSSRule | Null = js.native
}

@JSGlobal("CSSRuleList")
@js.native
class CSSRuleListCls () extends CSSRuleList

@JSGlobal("CSSRuleList")
@js.native
object CSSRuleList extends Instantiable0[CSSRuleList]

