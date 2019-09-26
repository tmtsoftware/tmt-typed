package typings.rsocketDashCore.rSocketSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadSerializers[D, M] extends js.Object {
  var data: Serializer[D]
  var metadata: Serializer[M]
}

object PayloadSerializers {
  @scala.inline
  def apply[D, M](data: Serializer[D], metadata: Serializer[M]): PayloadSerializers[D, M] = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata)
  
    __obj.asInstanceOf[PayloadSerializers[D, M]]
  }
}

