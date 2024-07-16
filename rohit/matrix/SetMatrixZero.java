package rohit.matrix;

public class SetMatrixZero {
  public static void main(String args[]){
    int matrix[][] = {
      {1,2,3},
      {4,0,6},
      {7,8,9}
    };
    // System.err.println(matrix.length);
    // System.err.println(matrix[1].length);
    /*
     * matrix traversal
     */
    int indexI = 0;
    int indexJ = 0;
    int i = 0;
    int j = 0;
    for(i = 0; i < matrix.length; i++ ){
      for(j = 0 ; j < matrix[i].length; j++){
        if(matrix[i][j] == 0){
          System.err.print(matrix[i][j] + " at position " + i + " "+ j);
          indexI = i;
          indexJ = j;
          break;
        }
      }
    }
    System.err.println(" The indexes are " + indexI + " " +indexJ);
    i = 0 ;
    j = 0;
    for(i = 0 ;i < matrix.length ; i++){
      matrix[indexI][i] = 0;
      matrix[i][indexJ] = 0;
    }
    for (i = 0; i < matrix.length; i++) {
      for (j = 0; j < matrix[i].length; j++) {
        System.err.print(matrix[i][j] +" ");
      }
      System.err.println();
    }
  }
}
