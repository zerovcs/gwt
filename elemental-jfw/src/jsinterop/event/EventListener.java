package jsinterop.event;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface EventListener
{
	public void handleEvent(Event event);
}