package rohit.algorithums;

public class Boyer_Moore_Voting_algorithm {
  public static void main(String[] args){
    int a[] = new int[]{1,1,3,4,5,6,7,7,7,7,7};
    Boyer_Moore_Voting_algorithm ob = new Boyer_Moore_Voting_algorithm();
    int result = ob.algo(a);
    System.err.println(" The resulr is " + result);
  }

  private int algo(int[] a) {
    int candiade = a[0];
    int count = 1;
    int i;
    for(i = 0; i < a.length ; i++) {
      if(count == 0){
        candiade = a[i];
        count = 1;
      } else if(candiade == a[i]){
        count++;
      } else{
        count--;
      }
    }
  //  throw new UnsupportedOperationException("Unimplemented method 'Implement'");
    return candiade;
  }
}
