package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionObserverInit extends js.Object {
  var root: js.UndefOr[Element | Null] = js.undefined
  var rootMargin: js.UndefOr[java.lang.String] = js.undefined
  var threshold: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object IntersectionObserverInit {
  @scala.inline
  def apply(
    root: Element = null,
    rootMargin: java.lang.String = null,
    threshold: Double | js.Array[Double] = null
  ): IntersectionObserverInit = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    if (rootMargin != null) __obj.updateDynamic("rootMargin")(rootMargin)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverInit]
  }
}

