package typings.atMaterialDashUiCore.stylesCreateMixinsMod

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createMixins.Mixins> */
trait MixinsOptions extends js.Object {
  var gutters: js.UndefOr[js.Function1[/* styles */ js.UndefOr[CSSProperties], CSSProperties]] = js.undefined
  var toolbar: js.UndefOr[CSSProperties] = js.undefined
}

object MixinsOptions {
  @scala.inline
  def apply(
    gutters: /* styles */ js.UndefOr[CSSProperties] => CSSProperties = null,
    toolbar: CSSProperties = null
  ): MixinsOptions = {
    val __obj = js.Dynamic.literal()
    if (gutters != null) __obj.updateDynamic("gutters")(js.Any.fromFunction1(gutters))
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[MixinsOptions]
  }
}

