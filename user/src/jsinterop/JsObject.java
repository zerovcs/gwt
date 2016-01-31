package jsinterop;

import jsinterop.annotations.JsPackage;

import jsinterop.annotations.JsType;

@JsType(isNative=true, name="Object", namespace=JsPackage.GLOBAL)
public class JsObject {
  //TODO implement basic JS Object methods
  public native boolean hasOwnProperty(String property);
  
  public static native JsObject getPrototypeOf(JsObject obj);
}
