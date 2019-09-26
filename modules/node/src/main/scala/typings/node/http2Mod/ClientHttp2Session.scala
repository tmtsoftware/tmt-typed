package typings.node.http2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.nodeStrings.altsvc
import typings.node.nodeStrings.connect
import typings.node.nodeStrings.origin
import typings.node.nodeStrings.stream
import typings.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "ClientHttp2Session")
@js.native
class ClientHttp2Session protected () extends Http2Session {
  @JSName("addListener")
  def addListener_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ java.lang.String, /* origin */ java.lang.String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connect(
    event: connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_origin(event: origin, listener: js.Function1[/* origins */ js.Array[java.lang.String], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("emit")
  def emit_altsvc(event: altsvc, alt: java.lang.String, origin: java.lang.String, stream: Double): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: connect, session: ClientHttp2Session, socket: Socket): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: connect, session: ClientHttp2Session, socket: TLSSocket): Boolean = js.native
  @JSName("emit")
  def emit_origin(event: origin, origins: js.Array[java.lang.String]): Boolean = js.native
  @JSName("emit")
  def emit_stream(
    event: stream,
    stream: ClientHttp2Stream,
    headers: IncomingHttpHeaders with IncomingHttpStatusHeader,
    flags: Double
  ): Boolean = js.native
  @JSName("on")
  def on_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ java.lang.String, /* origin */ java.lang.String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(
    event: connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_origin(event: origin, listener: js.Function1[/* origins */ js.Array[java.lang.String], Unit]): this.type = js.native
  @JSName("on")
  def on_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ java.lang.String, /* origin */ java.lang.String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connect(
    event: connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_origin(event: origin, listener: js.Function1[/* origins */ js.Array[java.lang.String], Unit]): this.type = js.native
  @JSName("once")
  def once_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ java.lang.String, /* origin */ java.lang.String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_origin(event: origin, listener: js.Function1[/* origins */ js.Array[java.lang.String], Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ java.lang.String, /* origin */ java.lang.String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_origin(event: origin, listener: js.Function1[/* origins */ js.Array[java.lang.String], Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def request(): ClientHttp2Stream = js.native
  def request(headers: OutgoingHttpHeaders): ClientHttp2Stream = js.native
  def request(headers: OutgoingHttpHeaders, options: ClientSessionRequestOptions): ClientHttp2Stream = js.native
}
