package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey>> */
trait PartialClassNameMapCollapseClassKey extends js.Object {
  var container: js.UndefOr[String] = js.undefined
  var entered: js.UndefOr[String] = js.undefined
  var wrapper: js.UndefOr[String] = js.undefined
  var wrapperInner: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapCollapseClassKey {
  @scala.inline
  def apply(
    container: String = null,
    entered: String = null,
    wrapper: String = null,
    wrapperInner: String = null
  ): PartialClassNameMapCollapseClassKey = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (entered != null) __obj.updateDynamic("entered")(entered)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    if (wrapperInner != null) __obj.updateDynamic("wrapperInner")(wrapperInner)
    __obj.asInstanceOf[PartialClassNameMapCollapseClassKey]
  }
}
