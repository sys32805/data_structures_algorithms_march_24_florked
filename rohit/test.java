package rohit;
import java.util.*;
// public class test {
//   public static void main(String[] args){
//     String strSet1 = "qwertyuiop";
//     String strSet2 = "asdfghjkl";
//     String strSet3 = "zxcvbnm";
//     String a[] = new String[]{ "Hello", "Alaska", "Dad", "Peace"};
//     List<String> listA = new ArrayList<String>();
//     for (String string : a) {
//       int[] count = new int[3];
//       for(char st : (string.toLowerCase()).toCharArray()){
//         System.err.println(" The word is " + st);
//         if(strSet1.indexOf(st) != -1){
//           count[0] = 1;
//         } else if(strSet2.indexOf(st) != -1){
//           count[1] = 1;
//         } else if(strSet3.indexOf(st) != -1){
//           count[2] = 1;
//         }
//       }

//       if(Arrays.stream(count).sum() == 1){
//         listA.add(string);
//       }

//     }
//     System.err.println(" The word is " + listA);
//   }
// }
//Question 2
// public class test {
//   /*
//    * This is for practice boyer more algorithum for max repetative number
//    */
//   public static void main(String[] args){
//     int a[] = new int[]{1,1,2,4,1};
//     test ob  = new test();
//     ob.MaxRepetative(a);
//   }

//   private void MaxRepetative(int[] a) {
//     /*
//      * implementation for BoyerMore algorithum
//      */
//     int candidate = a[0];
//     int count = 1;
//     for(int i = 1 ; i < a.length ; i++){
//       if(count == 0){
//         a[i] = candidate;
//       }else if(candidate == a[i]){
//         count++;
//       }
//     }
//     System.err.println("Max repetative number is " +candidate );
//   }
// }