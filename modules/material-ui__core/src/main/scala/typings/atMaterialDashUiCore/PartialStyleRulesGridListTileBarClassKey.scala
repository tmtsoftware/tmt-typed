package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTileBar.GridListTileBarClassKey>> */
trait PartialStyleRulesGridListTileBarClassKey extends js.Object {
  var actionIcon: js.UndefOr[CSSProperties] = js.undefined
  var actionIconActionPosLeft: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var rootSubtitle: js.UndefOr[CSSProperties] = js.undefined
  var subtitle: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[CSSProperties] = js.undefined
  var titlePositionBottom: js.UndefOr[CSSProperties] = js.undefined
  var titlePositionTop: js.UndefOr[CSSProperties] = js.undefined
  var titleWrap: js.UndefOr[CSSProperties] = js.undefined
  var titleWrapActionPosLeft: js.UndefOr[CSSProperties] = js.undefined
  var titleWrapActionPosRight: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesGridListTileBarClassKey {
  @scala.inline
  def apply(
    actionIcon: CSSProperties = null,
    actionIconActionPosLeft: CSSProperties = null,
    root: CSSProperties = null,
    rootSubtitle: CSSProperties = null,
    subtitle: CSSProperties = null,
    title: CSSProperties = null,
    titlePositionBottom: CSSProperties = null,
    titlePositionTop: CSSProperties = null,
    titleWrap: CSSProperties = null,
    titleWrapActionPosLeft: CSSProperties = null,
    titleWrapActionPosRight: CSSProperties = null
  ): PartialStyleRulesGridListTileBarClassKey = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon)
    if (actionIconActionPosLeft != null) __obj.updateDynamic("actionIconActionPosLeft")(actionIconActionPosLeft)
    if (root != null) __obj.updateDynamic("root")(root)
    if (rootSubtitle != null) __obj.updateDynamic("rootSubtitle")(rootSubtitle)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titlePositionBottom != null) __obj.updateDynamic("titlePositionBottom")(titlePositionBottom)
    if (titlePositionTop != null) __obj.updateDynamic("titlePositionTop")(titlePositionTop)
    if (titleWrap != null) __obj.updateDynamic("titleWrap")(titleWrap)
    if (titleWrapActionPosLeft != null) __obj.updateDynamic("titleWrapActionPosLeft")(titleWrapActionPosLeft)
    if (titleWrapActionPosRight != null) __obj.updateDynamic("titleWrapActionPosRight")(titleWrapActionPosRight)
    __obj.asInstanceOf[PartialStyleRulesGridListTileBarClassKey]
  }
}
