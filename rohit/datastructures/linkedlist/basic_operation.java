
public class basic_operation {
  public class Node {
    int data;
    Node next;
    Node(int data, Node next){
      this.data = data;
      this.next = next;
    }
  }
    public Node head = null;
    public Node tail = null;

  /**
   * @param data
   */
  public void addnode( int data ) {
    Node newNode = new Node(data, null);
    if(head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void printNode() {
    Node current = head;
    while(current != null) {
      System.out.print(" Data -> " + current.data);
      current = current.next;
    }
      System.out.println();
  }
  public void insertNodeAtPosition(int data){
    Node current = head;
    Node newNode = new Node(data, null);
    // System.err.println(" Data -> " + current.data);
    // System.err.println(" Data -> " + previous.data);
    head = newNode;
    head.data = data;
    head.next = current;
  }

  public void deleteNodeAtPosition() {
    Node current = head;
    Node previous = tail;
    while(current.next != null) {
      previous = current;
      current = current.next;
    }
    previous.next = null;
  }

  public int lengthOfLinklist() {
    Node current = head;
    int count = 0;
    while(current != null){
      count++;
      current = current.next;
    }
    System.err.println(" length of linklist " +count);
    return count;
  }

  public void nThNodefromList(int index) {
    Node current = head;
    int count = 0;
    while ( current != null ) {
      ++count;
      if(count == index){
        System.err.println("value at index " + index + " is " + current.data);
      }
      current = current.next;
    }
  }

  public void reversNodes() {
    Node current = head;
    Node previous = null;
    Node next = null;
    while(current != null) {
      next  = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    head = previous;
  }

  public void MiddleNode() {
    Node slow = head;
    Node fast = head;
    while(slow != null  && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    System.err.println(" Middle node of list is " + slow.data );
  }

  public void remmoveDuplicate() {

  }
  public static void main(String args[]){
    basic_operation ob = new basic_operation();
    ob.addnode(1);
    ob.addnode(2);
    ob.addnode(3);
    ob.addnode(4);
    ob.addnode(6);
    ob.addnode(1);
    System.err.println("<---- whole data :----->");
    ob.printNode();
    System.err.println("<---- insertNodeAtPosition :----->");
    ob.insertNodeAtPosition(5);
    ob.printNode();
    System.err.println("<---- deleteNodeAtPosition :----->");
    ob.deleteNodeAtPosition();
    ob.printNode();
    System.err.println("<---- lengthOfLinklist :----->");
    ob.lengthOfLinklist();
    System.err.println("<---- Find nth node from link list :----->");
    ob.nThNodefromList(3);
    System.err.println("Reverse a linked list");
    ob.reversNodes();
    ob.printNode();
    System.err.println(" Implement an algorithm to find the middle element of a linked list ");
    ob.MiddleNode();
    ob.remmoveDuplicate();
  }

}
