package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepIcon/StepIcon.StepIconClasskey>> */
trait PartialClassNameMapStepIconClasskey extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var completed: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapStepIconClasskey {
  @scala.inline
  def apply(
    active: String = null,
    completed: String = null,
    error: String = null,
    root: String = null,
    text: String = null
  ): PartialClassNameMapStepIconClasskey = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (completed != null) __obj.updateDynamic("completed")(completed)
    if (error != null) __obj.updateDynamic("error")(error)
    if (root != null) __obj.updateDynamic("root")(root)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PartialClassNameMapStepIconClasskey]
  }
}
