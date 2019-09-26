package typings.std

import typings.std.stdNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorReturnResult[TReturn]
  extends IteratorResult[js.Any, TReturn] {
  var done: `true`
  var value: TReturn
}

object IteratorReturnResult {
  @scala.inline
  def apply[TReturn](done: `true`, value: TReturn): IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = done, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IteratorReturnResult[TReturn]]
  }
}
