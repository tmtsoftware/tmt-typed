package typings.node.dnsMod

import typings.node.nodeStrings.A
import typings.node.nodeStrings.AAAA
import typings.node.nodeStrings.ANY
import typings.node.nodeStrings.CNAME
import typings.node.nodeStrings.MX
import typings.node.nodeStrings.NAPTR
import typings.node.nodeStrings.NS
import typings.node.nodeStrings.PTR
import typings.node.nodeStrings.SOA
import typings.node.nodeStrings.SRV
import typings.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("dns", "resolve")
@js.native
object resolveNs extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def __promisify__(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
    ]) | SoaRecord
  ] = js.native
  @JSName("__promisify__")
  def __promisify___A(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___AAAA(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___ANY(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___CNAME(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___MX(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NAPTR(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NS(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___PTR(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___SOA(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("__promisify__")
  def __promisify___SRV(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___TXT(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

