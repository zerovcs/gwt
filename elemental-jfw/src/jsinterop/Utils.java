package jsinterop;

import java.util.logging.Level;
import java.util.logging.Logger;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.html.Document;
import jsinterop.html.Window;
import jsinterop.js.JsObject;

public final class Utils 
{
	private static Logger logger = Logger.getLogger("Utils");
	
	/**
	 * Returns global DOM window.
	 * @return
	 */
	@JsProperty(namespace=JsPackage.GLOBAL, name="window")
	public static native Window getWindow();

	/**
	 * Returns the global Document.
	 */
	@JsProperty(name = "document", namespace = JsPackage.GLOBAL)
    public static Document getDocument;

	/**
	 * Parse text as JSON
	 * @param json
	 * @return could be null if text could not be parsed
	 */
	public static <T extends JsObject> T parseJson(String json)
	{
		try
		{
			logger.log(Level.INFO, "Parsing JSON");
			return parse(json);
		}
		catch(Exception e)
		{
			logger.log(Level.SEVERE, "Utils: Exception while parsin JSON: ", e);
		}
		return null;
	}
	
	@JsMethod(namespace="JSON")
	static native <T extends JsObject> T parse(String json);
	
}
