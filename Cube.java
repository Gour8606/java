import java.util.Scanner;
class Cube {
Cube(){}
void calcCube(int num){
  try {
if (num>100){
    System.out.println("Exception thrown");
    }
else {
System.out.println("Cube of "+num+" is "+num*num);
    }
  }
catch (Exception e){
System.out.println("Cube is not possible to calculate : "+e);
   }
}
 public static void main (String[] args) {
   Cube c = new Cube();
   Scanner in = new Scanner(System.in);
   System.out.println("Enter a number");
   int a = in.nextInt();
   c.calcCube(a);	
  }
 }
