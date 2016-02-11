package jsinterop.js;

import jsinterop.annotations.JsPackage;

import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "FormData", namespace = JsPackage.GLOBAL)
public class FormData {
  public native void append(String name, Blob value, String filename);
  public native void append(String name, Blob value);
  public native void append(String name, String value);
  //TODO implements other methods
}
