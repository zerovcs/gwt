package jsinterop.js;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.event.EventListener;

@JsType(isNative=true, namespace=JsPackage.GLOBAL)
public class FileReader
{
	@JsProperty public native String getResult();
	@JsProperty public native void setOnloadend(EventListener listener);
	//TODO še ostale event listener-je. 
	public native void readAsText(Blob blob);
}