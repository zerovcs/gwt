package jsinterop;

import jsinterop.annotations.JsProperty;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Blob")
public class JsBlob extends JsObject {
  
  @JsProperty(name="isClosed") public native boolean isClosed();
  @JsProperty public native double getSize();
  @JsProperty public native String getType();
}
