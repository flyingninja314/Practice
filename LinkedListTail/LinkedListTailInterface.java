/*
 *  LinkedListTailInterface.java
 *  An interface for LinkedListTail.java
 */

public interface LinkedListTailInterface{

  /*
   * isEmpty()
   * returns true if this LinkedListTail is empty, false otherwise
   */
  public boolean isEmpty();

  /*
   * size()
   * returns the number of items in this LinkedListTail
   */
  public int size();

  /*
   * lookup()
   * returns value associated with key, or null reference if no such key exists
   */
  public String search(int key);

  /*
   * insert()
   * inserts a new (key,value) pair into this LinkedListTail
   * pre-condition: lookup(key)==null
   */
  public void insert(int key, String value);

  /*
   * delete()
   * deletes the Node with the given key
   * pre-condition: lookup(key)!=null
   */
  public void delete(int key);

  /*
   * makeEmpty()
   * sets the LinkedListTail to the empty state
   */
  public void makeEmpty();

  /*
   * toString()
   * returns a String representation of this LinkedListTail
   */
  public String toString();
}
