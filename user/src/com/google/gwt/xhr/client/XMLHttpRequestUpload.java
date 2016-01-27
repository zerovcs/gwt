package com.google.gwt.xhr.client;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.event.ProgressEvent;

@JsType(isNative=true, namespace=JsPackage.GLOBAL)
public interface XMLHttpRequestUpload 
{
	@JsProperty public void setOnprogress(ProgressEventListener listener);
	
	@JsFunction
	public interface ProgressEventListener
	{
		public void handleEvent(ProgressEvent progressEvent);
	}
}
