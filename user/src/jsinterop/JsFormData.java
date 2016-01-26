package jsinterop;

import jsinterop.annotations.JsPackage;

import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "FormData", namespace = JsPackage.GLOBAL)
public class JsFormData {
  public native void append(String name, JsBlob value, String filename);
  public native void append(String name, JsBlob value);
  public native void append(String name, String value);
  //TODO implements other methods
}
