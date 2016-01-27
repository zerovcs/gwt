package jsinterop.event;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=JsPackage.GLOBAL)
//Should probably extends Event but for should be good enough
public interface ProgressEvent {
	@JsProperty(name="lengthComputable") public boolean isLengthComputable();
	@JsProperty public double getTotal(); 
	@JsProperty public double getLoaded(); 
}
