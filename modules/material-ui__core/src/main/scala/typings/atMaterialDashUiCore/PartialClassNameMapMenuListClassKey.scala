package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MenuList/MenuList.MenuListClassKey>> */
trait PartialClassNameMapMenuListClassKey extends js.Object {
  var dense: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var subheader: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapMenuListClassKey {
  @scala.inline
  def apply(dense: String = null, padding: String = null, root: String = null, subheader: String = null): PartialClassNameMapMenuListClassKey = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (root != null) __obj.updateDynamic("root")(root)
    if (subheader != null) __obj.updateDynamic("subheader")(subheader)
    __obj.asInstanceOf[PartialClassNameMapMenuListClassKey]
  }
}
