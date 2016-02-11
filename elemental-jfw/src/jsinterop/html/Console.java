package jsinterop.html;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.js.JsObject;

@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="console")
public interface Console 
{
    /**
     * Outputs a message to the Web Console.
     *
     * @param objects A list of JavaScript objects to output. The string representations of each of these
     *            objects are appended together in the order listed and output.
     */
    public void log(JsObject... objects);
    public void info(JsObject... objects);
    public void error(JsObject... objects);
    public void warn(JsObject... objects);

    public void log(String msg, JsObject... objects);
    public void info(String msg, JsObject... objects);
    public void error(String msg, JsObject... objects);
    public void warn(String msg, JsObject... objects);
}
