package jsinterop.html;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace=JsPackage.GLOBAL)
public interface NodeList 
{

    /**
     * Returns the number of nodes in the NodeList.
     *
     * @return The number of nodes in the NodeList.
     */
    @JsProperty
    int getLength();

    /**
     * Returns an item in the list by its index, or null if the index is out-of-bounds; can be used as an
     * alternative to simply accessing nodeList[index] (which instead returns undefined when index is
     * out-of-bounds).
     *
     * @param index The index to get the the item for
     * @return The item for the given index or null
     */
    <T extends Node> T item(int index);
}
