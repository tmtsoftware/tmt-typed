package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStderrStdoutBuffer extends js.Object {
  var stderr: java.lang.String | Buffer
  var stdout: java.lang.String | Buffer
}

object AnonStderrStdoutBuffer {
  @scala.inline
  def apply(stderr: java.lang.String | Buffer, stdout: java.lang.String | Buffer): AnonStderrStdoutBuffer = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStderrStdoutBuffer]
  }
}

