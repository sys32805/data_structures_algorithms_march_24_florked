import java.util.Currency;

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
    while(fast != null  && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    System.err.println(" Middle node of list is " + slow.data );
  }

  public void Swapnodes(int a , int b) {
   /* Input:  6 -> 4 -> 3 -> 2 -> 1 -> 5
      Output: 6 -> 2 -> 3 -> 4 -> 1 -> 5
      // Output: 4 -> 6 -> 2 -> 3 -> 5 -> 1
    */
    Node current = head;
    Node currentA = head;
    Node temp = null;
    Node previousA = null;
    Node currentB = head;
    Node previousB = null;
    while(currentA != null && currentA.data != a){
      previousA = currentA;
      currentA = currentA.next;
      // System.err.println("List from A is " + currentA.data);
      // System.err.println("List a-> from A is " + previousA.data);
    }
    while(currentB != null && currentB.data != b){
      previousB = currentB;
      currentB = currentB.next;
      // System.err.println("List from B is " + currentB.data);
      // System.err.println("List p-> from B is " + previousB.data);
    }
    if(currentA != null && currentB != null){
      if(previousA != null){
        previousA.next= currentB;
      } else {
        head = currentB;
      }
      if(previousB != null){
        previousB.next= currentA;
      } else {
        head = currentA;
      }
      temp = currentA.next;
      currentA.next = currentB.next;
      currentB.next = temp;
    }
  }
  public void remmoveDuplicate() {
   Node current = head;
   while(current != null){
      Node eachIndex = current;
        while(eachIndex.next != null){
          if(eachIndex.next.data == current.data){
             eachIndex.next = eachIndex.next.next;
          } else{
            eachIndex = eachIndex.next;
          }
        }
        current = current.next;
    }
  }
  public static void main(String args[]){
    basic_operation ob = new basic_operation();
    ob.addnode(1);
    ob.addnode(2);
    ob.addnode(3);
    ob.addnode(4);
    ob.addnode(6);
    ob.addnode(1);
    ob.addnode(3);
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
    /*Question: Swap Nodes in Pairs
    Given a singly linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the nodes, only nodes themselves may be changed.
    Example:
    Input: 1 -> 2 -> 3 -> 4
    Output: 2 -> 1 -> 4 -> 3
    */
    // System.err.println("Swap Nodes in Pairs");
    // ob.Swapnodes(4 , 2);
    ob.printNode();
    System.err.println("linklist after removal of duplicate items");
    ob.remmoveDuplicate();
    System.err.println("After removal of common values");
    ob.printNode();
  }


}
