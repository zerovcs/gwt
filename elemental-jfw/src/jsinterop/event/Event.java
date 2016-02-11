package jsinterop.event;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=JsPackage.GLOBAL)
interface Event 
{
   /**
     * Cancels the event (if it is cancelable).
     */
    void preventDefault();

    /**
     * Stops the propagation of events further along in the DOM.
     */
    void stopPropagation();

}