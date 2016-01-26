package jsinterop;

import jsinterop.annotations.JsProperty;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Blob")
public interface JsBlob extends JsObject {
  
  @JsProperty(name="isClosed") public boolean isClosed();
  @JsProperty public double getSize();
  @JsProperty public String getType();
}
