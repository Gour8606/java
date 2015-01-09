class Transpose {
  public static void main (String[] args) {
  int[][] mat1 = new int[4][4];
  int[][] mat2 = new int[4][4];
  int k = 0; 
  for (int i=0;i<4;i++) {
     for (int j=0;j<4;j++) { 
        if (k<16) {
        mat1[i][j] = Integer.parseInt(args[k]);
        k++;
        }
     }
  }
  for (int i=0;i<4;i++) {
     for (int j=0;j<4;j++) { 
        if (i!=j) {
          mat2[j][i] = mat1[i][j];
        }
        else if (i==j) {
          mat2[i][j] = mat1[i][j];
        }
     }
  }

System.out.println("Transpose of 4*4 matrix is");
    
  for (int i=0;i<4;i++) {
     for (int j=0;j<4;j++) { 
 System.out.print(mat2[i][j]+" ");
     }
System.out.println();
  }
 }
}     
