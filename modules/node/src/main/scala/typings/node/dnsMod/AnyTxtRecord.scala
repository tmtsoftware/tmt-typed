package typings.node.dnsMod

import typings.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyTxtRecord extends AnyRecord {
  var entries: js.Array[java.lang.String]
  var `type`: TXT
}

object AnyTxtRecord {
  @scala.inline
  def apply(entries: js.Array[java.lang.String], `type`: TXT): AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyTxtRecord]
  }
}
