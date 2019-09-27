package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Badge.BadgeClassKey>> */
trait PartialStyleRulesBadgeClassKey extends js.Object {
  var badge: js.UndefOr[CSSProperties] = js.undefined
  var colorPrimary: js.UndefOr[CSSProperties] = js.undefined
  var colorSecondary: js.UndefOr[CSSProperties] = js.undefined
  var dot: js.UndefOr[CSSProperties] = js.undefined
  var invisible: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesBadgeClassKey {
  @scala.inline
  def apply(
    badge: CSSProperties = null,
    colorPrimary: CSSProperties = null,
    colorSecondary: CSSProperties = null,
    dot: CSSProperties = null,
    invisible: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesBadgeClassKey = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (dot != null) __obj.updateDynamic("dot")(dot)
    if (invisible != null) __obj.updateDynamic("invisible")(invisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesBadgeClassKey]
  }
}
