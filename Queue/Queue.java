public class Queue {
  private class Node {
    int item;
    Node next;

    Node(int i) {
      item = i;
      next = null;
    }
  }

  Node front, end;
  int length;

  Queue() {
    front = null;
    end = null;
    length = 0;
  }

  public boolean isEmpty() {
    return (front == null || end == null || length == 0);
  }

  public int length() {
    return length;
  }

  public void enqueue(int itemToAdd) {
    if(isEmpty()) {
      Node N = new Node(itemToAdd);
      front = N;
      end = N;
    } else {
      end.next = new Node(itemToAdd);
      end = end.next;
    }
    length++;
  }

  public int dequeue() {
    int val = front.item;
    if(length == 1) {
      front = null;
      end = null;

    } else {
      front = front.next;
    }
    length--;
    return val;
  }

  public int peek() {
    return front.item;
  }

  public void dequeueAll() {
    front = null;
    end = null;
    length = 0;
  }

  public String toString() {
    String stringBoi = "";
    for(Node N = front; N != null; N = N.next) {
      stringBoi += N.item + "\n";
    }
    return stringBoi;
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    System.out.println(q.isEmpty());
    System.out.println(q.length());

    for(int i = 1; i < 1001; i++) {
      q.enqueue(i);
    }

    System.out.println(q);
    System.out.println(q.isEmpty());
    System.out.println(q.length());
    System.out.println(q.peek());

    for(int i = 1; i < 501; i++) {
      q.dequeue();
    }

    System.out.println(q);
    System.out.println(q.isEmpty());
    System.out.println(q.length());
    System.out.println(q.peek());

    q.dequeueAll();
    System.out.println(q.isEmpty());
    System.out.println(q.length());
  }
}
