package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "ftruncate")
@js.native
object ftruncate extends js.Object {
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    */
  def apply(fd: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def apply(
    fd: Double,
    len: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def apply(fd: Double, len: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def apply(fd: Double, len: Null, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def __promisify__(fd: Double): js.Promise[Unit] = js.native
  def __promisify__(fd: Double, len: Double): js.Promise[Unit] = js.native
}
