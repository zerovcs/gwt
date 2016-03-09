package jsinterop.html;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.event.EventListener;
import jsinterop.js.Blob;

/**
 * The window object represents an open window in a browser.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "window")
public class Window 
{
    /**
     * Returns the Console object
     *
     * @return The console object
     */
    @JsProperty public static native Console getConsole();

    /**
     * Returns the Document object for the window
     *
     * @return The Document object for the window
     */
    @JsProperty public static native Document getDocument();

    /**
     * The innerWidth property returns the inner width of a window's content area.
     *
     * @return The inner width of a window's content area.
     */
    @JsProperty public static native int getInnerWidth();

    /**
     * The innerHeight property returns the inner height of a window's content area.
     *
     * @return The inner height of a window's content area.
     */
    @JsProperty public static native int getInnerHeight();

    /**
     * The outerWidth property returns the outer width of a window, including all interface elements (like
     * toolbars/scrollbars).
     *
     * @return The outer width of a window, including all interface elements (like toolbars/scrollbars).
     */
    @JsProperty public static native int getOuterWidth();

    /**
     * The outerHeight property returns the outer height of a window, including all interface elements (like
     * toolbars/scrollbars).
     *
     * @return The outer height of a window, including all interface elements (like toolbars/scrollbars).
     */
    @JsProperty public static native int getOuterHeight();

    /**
     * Returns a reference to the local storage object used to store data. Stores data with no expiration date
     *
     * @return A reference to the local storage
     */
    @JsProperty public static native Storage getLocalStorage();

    /**
     * Returns a reference to the local storage object used to store data. Stores data for one session (lost
     * when the browser tab is closed)
     *
     * @return A reference to the local session storage object
     */
    @JsProperty public static native Storage getSessionStorage();

    /**
     * Displays an alert box with a specified message and an OK button.
     *
     * @param message The text to display in the alert box
     */
    public static native void alert(String message);
    
    /**
     * Register an event handler to a specific event type on the window.
     * @param type
     * @param listener
     * @param useCapture
     */
    public static native void addEventListener(String type, EventListener listener, boolean useCapture);
    
    /**
     * Provides a secure means for one window to send a string of data to another window, which need not be within the same domain as the first.
     */
    public static native void postMessage(String message, String targetOrigin);

    /**
     * Provides a secure means for one window to send a string of data to another window, which need not be within the same domain as the first.
     */
    public static native void postMessage(Blob message, String targetOrigin);

    /**
     * Provides a secure means for one window to send a string of data to another window, which need not be within the same domain as the first.
     */
//    public static native void postMessage(ArrayBuffer message, String targetOrigin); TODO
}
