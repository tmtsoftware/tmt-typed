package typings.node.assertMod

import typings.node.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assert", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val strict: js.Function2[/* value */ js.Any, /* message */ js.UndefOr[java.lang.String | Error], Unit] = js.native
  def apply(value: js.Any): Unit = js.native
  def apply(value: js.Any, message: java.lang.String | Error): Unit = js.native
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function, message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function, message: Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: RegExp): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: RegExp, message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: RegExp, message: Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], message: Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_]): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function, message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function, message: Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: RegExp): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: RegExp, message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: RegExp, message: Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], message: Error): js.Promise[Unit] = js.native
  def doesNotThrow(block: js.Function0[_]): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function, message: java.lang.String): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function, message: Error): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: RegExp): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: RegExp, message: java.lang.String): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: RegExp, message: Error): Unit = js.native
  def doesNotThrow(block: js.Function0[_], message: java.lang.String): Unit = js.native
  def doesNotThrow(block: js.Function0[_], message: Error): Unit = js.native
  /** @deprecated since v9.9.0 - use strictEqual() instead. */
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
  def fail(): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: Error): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: Error, operator: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: Error,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(message: java.lang.String): scala.Nothing = js.native
  def fail(message: Error): scala.Nothing = js.native
  def ifError(value: js.Any): Unit = js.native
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: java.lang.String): Unit = js.native
  def ok(value: js.Any, message: Error): Unit = js.native
  def rejects(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: js.Function): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: js.Function, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: js.Function, message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: js.Object): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: js.Object, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: js.Object, message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: Error, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: Error, message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: RegExp): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: RegExp, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: RegExp, message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_]): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Function): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Function, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Function, message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Object): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Object, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Object, message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: Error, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: Error, message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: RegExp): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: RegExp, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: RegExp, message: Error): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], message: Error): js.Promise[Unit] = js.native
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
  def throws(block: js.Function0[_]): Unit = js.native
  def throws(block: js.Function0[_], error: js.Function): Unit = js.native
  def throws(block: js.Function0[_], error: js.Function, message: java.lang.String): Unit = js.native
  def throws(block: js.Function0[_], error: js.Function, message: Error): Unit = js.native
  def throws(block: js.Function0[_], error: js.Object): Unit = js.native
  def throws(block: js.Function0[_], error: js.Object, message: java.lang.String): Unit = js.native
  def throws(block: js.Function0[_], error: js.Object, message: Error): Unit = js.native
  def throws(block: js.Function0[_], error: Error, message: java.lang.String): Unit = js.native
  def throws(block: js.Function0[_], error: Error, message: Error): Unit = js.native
  def throws(block: js.Function0[_], error: RegExp): Unit = js.native
  def throws(block: js.Function0[_], error: RegExp, message: java.lang.String): Unit = js.native
  def throws(block: js.Function0[_], error: RegExp, message: Error): Unit = js.native
  def throws(block: js.Function0[_], message: java.lang.String): Unit = js.native
  def throws(block: js.Function0[_], message: Error): Unit = js.native
}
