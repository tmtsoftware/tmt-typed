package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Popover.PopoverClassKey>> */
trait PartialStyleRulesPopoverClassKey extends js.Object {
  var paper: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesPopoverClassKey {
  @scala.inline
  def apply(paper: CSSProperties = null): PartialStyleRulesPopoverClassKey = {
    val __obj = js.Dynamic.literal()
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesPopoverClassKey]
  }
}

