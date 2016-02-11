package jsinterop.html;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name="Element", namespace=JsPackage.GLOBAL)
public interface Element extends Node {

    /**
     * Getter for innerHTML attribute
     *
     * @return The markup of the element's content.
     */
    @JsProperty
    public String getInnerHTML();

    /**
     * Setter for innerHTML attribute
     *
     * @param s The markup of the element's content.
     */
    @JsProperty
    public void setInnerHTML(String s);


    /**
     * Adds a new attribute or changes the value of an existing attribute on the specified element.
     *
     * @param name The name of the attribute as a string.
     * @param value The desired new value of the attribute.
     */
    public void setAttribute(String name, Object value);

    /**
     * Returns the value of a specified attribute on the element. If the given attribute does not exist, the
     * value returned will either be null or ""
     *
     * @param name The name of the attribute whose value you want to get.
     * @return The value of a specified attribute on the element or null
     */
    public String getAttribute(String name);

    /**
     * Method returns whether the current element has the specified attribute
     *
     * @param name A string representing the name of the attribute.
     * @return Indicates whether the current element has the specified attribute
     */
    public boolean hasAttribute(String name);

    /**
     * Removes an attribute from the specified element.
     *
     * @param name The name of the attribute to be removed from element.
     */
    public void removeAttribute(String name);

}	
