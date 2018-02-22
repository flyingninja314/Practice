public class LinkedListTail implements LinkedListTailInterface {
  private class Node {
    int key;
    String value;
    Node next;

    Node(int k, String v) {
      key = k;
      value = v;
      next = null;
    }
  }

  private Node head, tail;
  private int length;

  LinkedListTail() {
    head = null;
    tail = null;
    length = 0;
  }

  public boolean isEmpty() {
    return (head == null || tail == null || length == 0);
  }

  public int size() {
    return length;
  }

  public String search(int keyToFind) {
    if(isEmpty()) {
      // throw error
    }
    for(Node N = head; N != null; N = N.next) {
      if(N.key == keyToFind) {
        return N.value;
      }
    }
    // say key not found
    return null;
  }

  public void insert(int keyToAdd, String valToAdd) {
    if(search(keyToAdd) != null) {
      // throw duplicate key
    }
    if(size() == 0) {
      Node N = new Node(keyToAdd, valToAdd);
      head = N;
      tail = N;
    } else {
      tail.next = new Node(keyToAdd, valToAdd);
      tail = tail.next;
    }
    length++;
  }

  public void delete(int keyToDel) {
    if(search(keyToDel) == null) {
      // throw key not found
    }
    if(head.key == keyToDel) {
      head = head.next;
    } else if(tail.key == keyToDel) {
      Node N = head;
      while(N.next != tail) {
        N = N.next;
      }
      tail = N;
      N.next = null;
    } else {
      Node parent = null;
      Node child = head;
      while(child.key != keyToDel) {
        parent = child;
        child = child.next;
      }
      child = child.next;
      parent.next = child;
    }
    length--;
  }

  public void makeEmpty() {
    head = null;
    length = 0;
  }

  public String toString() {
    String stringBoi = "";
    for(Node N = head; N != null; N = N.next) {
      stringBoi += N.key + " " + N.value + "\n";
    }
    return stringBoi;
  }

  public static void main(String[] args) {
    LinkedListTail l = new LinkedListTail();

    System.out.println(l.isEmpty());
    System.out.println(l.size());

    for(int i = 1; i < 1001; i++) {
      l.insert(i, "test"+i);
    }

    System.out.println(l);
    System.out.println(l.isEmpty());
    System.out.println(l.size());

    for(int i = 1; i < 501; i++) {
      l.delete(i*2);
    }

    System.out.println(l);
    System.out.println(l.isEmpty());
    System.out.println(l.size());

    l.makeEmpty();
    System.out.println(l.isEmpty());
    System.out.println(l.size());
  }
}
