package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBTransactionEventMap extends js.Object {
  var abort: Event
  var complete: Event
  var error: Event
}

object IDBTransactionEventMap {
  @scala.inline
  def apply(abort: Event, complete: Event, error: Event): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort, complete = complete, error = error)
  
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
}

