import java.util.Arrays;

public class MinElement {
public void FindMinElement(int[] m, int higest ){
  int i = 0;
  boolean flag = false ;
  boolean Infinite = true;
  Arrays.sort(m);
  while(Infinite){
      ++i;
      // System.out.println("rohit"+ m[i]+i);
      if(higest < m[i]){
        higest = m[i];
        flag = true;
      }
      if(flag && (m.length-1) == i){
      //   if(higest < m[i]){
      //   higest = m[i];
      //   flag = true;
      // }
        System.out.println(higest);
        break;
      }

  }
}
  public static void main(String[] args){
    int[] a = { 100,98,1,34,10,9,4,-1};
    int higest  = -9999;
    (new MinElement()).FindMinElement(a,higest);
  }
}
