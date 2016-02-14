package jsinterop.html;

import jsinterop.annotations.JsProperty;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=JsPackage.GLOBAL)
public interface Storage 
{

  /**
   * Returns an integer representing the number of data items stored in the Storage object.
   */
  @JsProperty int getLength(); 

  /**
   * When passed a number index, this method will return the name of the nth key in the storage.
   */
  public String key(int index);

  /**
   * When passed a key name, will return that key's value. 
   */
  public String getItem(String key);
    
  /**
   * When passed a key name and value, will add that key to the storage, or update that key's value if it already exists. 
   */
  public void setItem(String key, String value);
    
  /**
   * When passed a key name, will remove that key from the storage. 
   */
  public void removeItem(String key);
  
  /**
   * When invoked, will empty all keys out of the storage.
   */
  public void clear();
     
}
