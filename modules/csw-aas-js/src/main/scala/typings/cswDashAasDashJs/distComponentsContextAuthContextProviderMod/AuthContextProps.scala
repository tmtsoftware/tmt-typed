package typings.cswDashAasDashJs.distComponentsContextAuthContextProviderMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextProps extends js.Object {
  var children: ReactNode
  var config: AuthContextConfig
}

object AuthContextProps {
  @scala.inline
  def apply(config: AuthContextConfig, children: ReactNode = null): AuthContextProps = {
    val __obj = js.Dynamic.literal(config = config)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthContextProps]
  }
}

