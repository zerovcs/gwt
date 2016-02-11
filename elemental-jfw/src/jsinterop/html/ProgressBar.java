package jsinterop.html;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Progress")
public interface ProgressBar extends Element //TODO bolje bi bilo, ce bi extends HTMLElement
{
	@JsProperty public void setValue(double value);
    @JsProperty public void setMax(double max);
    @JsProperty public double getOffsetWidth();
    @JsProperty public double getOffsetHeight();
}