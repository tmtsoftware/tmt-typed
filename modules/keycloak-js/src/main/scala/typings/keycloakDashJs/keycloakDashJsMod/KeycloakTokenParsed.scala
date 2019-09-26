package typings.keycloakDashJs.keycloakDashJsMod

import typings.keycloakDashJs.Anon_Roles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakTokenParsed extends js.Object {
  var exp: js.UndefOr[Double] = js.undefined
  var iat: js.UndefOr[Double] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var realm_access: js.UndefOr[Anon_Roles] = js.undefined
  var resource_access: js.UndefOr[js.Array[String]] = js.undefined
  var session_state: js.UndefOr[String] = js.undefined
  var sub: js.UndefOr[String] = js.undefined
}

object KeycloakTokenParsed {
  @scala.inline
  def apply(
    exp: Int | Double = null,
    iat: Int | Double = null,
    nonce: String = null,
    realm_access: Anon_Roles = null,
    resource_access: js.Array[String] = null,
    session_state: String = null,
    sub: String = null
  ): KeycloakTokenParsed = {
    val __obj = js.Dynamic.literal()
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (realm_access != null) __obj.updateDynamic("realm_access")(realm_access)
    if (resource_access != null) __obj.updateDynamic("resource_access")(resource_access)
    if (session_state != null) __obj.updateDynamic("session_state")(session_state)
    if (sub != null) __obj.updateDynamic("sub")(sub)
    __obj.asInstanceOf[KeycloakTokenParsed]
  }
}
