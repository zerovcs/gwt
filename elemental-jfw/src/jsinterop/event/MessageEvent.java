package jsinterop.event;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.html.Window;
import jsinterop.js.Blob;

@JsType(isNative=true, namespace=JsPackage.GLOBAL)
public interface MessageEvent extends Event 
{
	@JsProperty(name="data") public String getStringData();
//	@JsProperty(name="data") public Blob getBlobData(); //error prleti: annot both use the same JavaScript name 'data'
//	TODO @JsProperty(name="data") ArrayBuffer getArrayBufferData(); 
	
	@JsProperty public String getOrigin();
	@JsProperty public Window getSource();
}
