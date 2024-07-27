package rohit;
import java.util.*;

class node{
  int data;
  node next;
   node(int data , node next){
    this.data= data;
    this.next = next;
  }
}
public class kjsjaajk {
  static node head;
  // static{
  //   List<Integer> ob = new ArrayList<>();
  //   int a = 1009;
  //   int b = 1;
  //   int carry = 0;
  //   while(a != 0){
  //     int digitFrom1 = a % 10 + carry;
  //     int digitFrom2 = b % 10;
  //     a = a / 10;
  //     b = b / 10;
  //     int lastDigit = (digitFrom1 + digitFrom2) % 10;
  //     ob.add(lastDigit);
  //     carry = (digitFrom1 + digitFrom2) / 10;
  //   }
  //   if(carry > 0 ){
  //     ob.add(carry);
  //   }
  //   Collections.reverse(ob);
  //   System.out.println(ob);
  // }
    public static void main(String[] args){
      head  = new node(1, null);
      head.next = new node(2,null);
      head.next.next = new node(3, null);
      System.out.print("Before reversing the node");

      printNodes(head);
      node prv = reverseNode(head);
      addNumbers(prv);
      printNodes(prv);
  }

  static void addNumbers(node head){
    int num2   = 100;
    node current  = head;
    System.err.print("Adding the 99 to each values");
    while(current != null){
      int num = addNumbers(99 ,current.data);
      System.out.print(" -> " + num);
      current = current.next;
    }
  }

  static int addNumbers( int num1 , int num2){
    List<Integer> ob = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int a = num1;
    int b = num2;
    int carry = 0;
    while(a != 0){
      int digitFrom1 = a % 10 + carry;
      int digitFrom2 = b % 10;
      a = a / 10;
      b = b / 10;
      int lastDigit = (digitFrom1 + digitFrom2) % 10;
      ob.add(lastDigit);
      carry = (digitFrom1 + digitFrom2) / 10;
    }
      if(carry > 0 ){
        ob.add(carry);
      }
      Collections.reverse(ob);
      for (int num : ob) {
        sb.append(num);
      }
      return Integer.parseInt(sb.toString());
  }

  static void printNodes(node head){
    node currNode  = head;
    System.err.print("   Nodes  are ");
    while (currNode != null) {
      System.err.print(" -> " + currNode.data);
      currNode = currNode.next;
    }
    System.err.println();
  }

  static node reverseNode(node head){
      System.err.println();
      System.out.print(" After reversing the node ");
      node next = null;
      node current = head;
      node previous = null;
      while( current != null){
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
      }
      node temp = previous;
      while (previous != null) {
        System.err.print(" -> " + previous.data);
        previous = previous.next;
      }
      System.err.println();
      return temp;
  }
}