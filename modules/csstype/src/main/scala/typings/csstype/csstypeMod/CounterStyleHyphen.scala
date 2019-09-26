package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStyleHyphen extends js.Object {
  var `additive-symbols`: js.UndefOr[String] = js.undefined
  var fallback: js.UndefOr[String] = js.undefined
  var negative: js.UndefOr[String] = js.undefined
  var pad: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[CounterStyleRangeProperty] = js.undefined
  var `speak-as`: js.UndefOr[CounterStyleSpeakAsProperty] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var symbols: js.UndefOr[String] = js.undefined
  var system: js.UndefOr[CounterStyleSystemProperty] = js.undefined
}

object CounterStyleHyphen {
  @scala.inline
  def apply(
    `additive-symbols`: String = null,
    fallback: String = null,
    negative: String = null,
    pad: String = null,
    prefix: String = null,
    range: CounterStyleRangeProperty = null,
    `speak-as`: CounterStyleSpeakAsProperty = null,
    suffix: String = null,
    symbols: String = null,
    system: CounterStyleSystemProperty = null
  ): CounterStyleHyphen = {
    val __obj = js.Dynamic.literal()
    if (`additive-symbols` != null) __obj.updateDynamic("additive-symbols")(`additive-symbols`)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (negative != null) __obj.updateDynamic("negative")(negative)
    if (pad != null) __obj.updateDynamic("pad")(pad)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`speak-as` != null) __obj.updateDynamic("speak-as")(`speak-as`.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (symbols != null) __obj.updateDynamic("symbols")(symbols)
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterStyleHyphen]
  }
}

