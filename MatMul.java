import java.util.Scanner;
class MatMul {
  public static void main (String[] args) {
  int[][] mat1 = new int[4][4];
  int[][] mat2 = new int[4][4];
  int[][] mat3 = new int[4][4];
    Scanner in = new Scanner(System.in);
  System.out.println("Enter the elements of matrix 1");
    
  for (int i=0;i<4;i++) {
     for (int j=0;j<4;j++) { 
        mat1[i][j] = in.nextInt();
     }
  }
System.out.println("Enter the elements of matrix 2");
    
  for (int i=0;i<4;i++) {
     for (int j=0;j<4;j++) { 
        mat2[i][j] = in.nextInt();
     }
  }

System.out.println("Multipilcation of two 4*4 matrices is");
    
  for (int i=0;i<4;i++) {
     for (int j=0;j<4;j++) { 
        mat3[i][j] = 0;
        for (int k=0;k<4;k++) {
           mat3[i][j] = mat3[i][j]+mat1[i][k]*mat2[k][j];
        }
 System.out.print(mat3[i][j]+" ");
     }
System.out.println();
  }
 }
}     
