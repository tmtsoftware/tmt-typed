package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuingStrategy[T] extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[QueuingStrategySizeCallback[T]] = js.undefined
}

object QueuingStrategy {
  @scala.inline
  def apply[T](highWaterMark: Int | Double = null, size: T => Double = null): QueuingStrategy[T] = {
    val __obj = js.Dynamic.literal()
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(js.Any.fromFunction1(size))
    __obj.asInstanceOf[QueuingStrategy[T]]
  }
}

