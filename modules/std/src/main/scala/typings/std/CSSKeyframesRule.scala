package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE). */
trait CSSKeyframesRule extends CSSRule {
  val cssRules: CSSRuleList
  var name: java.lang.String
  def appendRule(rule: java.lang.String): Unit
  def deleteRule(select: java.lang.String): Unit
  def findRule(select: java.lang.String): CSSKeyframeRule | Null
}

@JSGlobal("CSSKeyframesRule")
@js.native
class CSSKeyframesRuleCls () extends CSSKeyframesRule {
  /* CompleteClass */
  override val CHARSET_RULE: Double = js.native
  /* CompleteClass */
  override val FONT_FACE_RULE: Double = js.native
  /* CompleteClass */
  override val IMPORT_RULE: Double = js.native
  /* CompleteClass */
  override val KEYFRAMES_RULE: Double = js.native
  /* CompleteClass */
  override val KEYFRAME_RULE: Double = js.native
  /* CompleteClass */
  override val MEDIA_RULE: Double = js.native
  /* CompleteClass */
  override val NAMESPACE_RULE: Double = js.native
  /* CompleteClass */
  override val PAGE_RULE: Double = js.native
  /* CompleteClass */
  override val STYLE_RULE: Double = js.native
  /* CompleteClass */
  override val SUPPORTS_RULE: Double = js.native
  /* CompleteClass */
  override val UNKNOWN_RULE: Double = js.native
  /* CompleteClass */
  override val VIEWPORT_RULE: Double = js.native
  /* CompleteClass */
  override val cssRules: CSSRuleList = js.native
  /* CompleteClass */
  override var cssText: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override val parentRule: CSSRule | Null = js.native
  /* CompleteClass */
  override val parentStyleSheet: CSSStyleSheet | Null = js.native
  /* CompleteClass */
  override val `type`: Double = js.native
  /* CompleteClass */
  override def appendRule(rule: java.lang.String): Unit = js.native
  /* CompleteClass */
  override def deleteRule(select: java.lang.String): Unit = js.native
  /* CompleteClass */
  override def findRule(select: java.lang.String): CSSKeyframeRule | Null = js.native
}

@JSGlobal("CSSKeyframesRule")
@js.native
object CSSKeyframesRule extends Instantiable0[CSSKeyframesRule]

