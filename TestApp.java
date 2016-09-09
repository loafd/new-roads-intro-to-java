import java.util.Scanner;
public class TestApp{

  public static void main(string[] args){
    
    //system.out.print(numOne ¨ + ¨ numTwo ¨ = ¨ answer
    
    Scanner input = new Scanner(System.in);
    System.out.prinln("Print three numbers");
    double num3 = input.nextDouble();
    double num4 = input.nextdouble();
    double num5 = input.nextdouble();
    double answer = num3 + num4 + num5;
    
    System.out.println("The numbers you chose are " + num3 +  ", " + num4 + ", " + num5);
  
  }
}