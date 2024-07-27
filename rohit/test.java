package rohit;
import java.util.*;
public class test {
  public static void main(String[] args){
    int[] a = { 1, 2, 3 };
    int[] b = { 1, 2, 3 };
    int resultofab  = arrayToint(a , b);
    System.err.println(resultofab);
  }
  static int arrayToint(int[] a , int[] b){
    String resulta = "";
    String resultb = "";
    for(int i = 0 ; i < a.length ; i++){
      resulta += Integer.toString(a[i]);
      resultb += Integer.toString(b[i]);
    }
    return Integer.parseInt(resulta) + Integer.parseInt(resultb);
  }
}
