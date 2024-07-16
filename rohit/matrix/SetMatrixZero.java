package rohit.matrix;

public class SetMatrixZero {
  public static void main(String args[]){
    int matrix[][] = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    // System.err.println(matrix.length);
    // System.err.println(matrix[1].length);
    /*
     * matrix traversal
     */
    for(int i = 0; i < matrix.length; i++ ){
      for(int j = 0 ;j< matrix[i].length;j++){
        System.err.print(matrix[i][j] + " ");
      }
      System.err.println();
    }
  }
}
