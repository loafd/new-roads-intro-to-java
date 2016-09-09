import java.util.Scanner;
public class testAverage {
    public static void main (String[]args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Print three numbers");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    double sum = num1 + num2 + num3;
    double answer = sum / 3;
    
    System.out.println("The average of these numbers is " + answer);
      
    boolean flag = false;
      
    if (answer > 2)
    {
    flag = true
    }
    if else
    {
      System.out.println("Tom is not the coolest");
    }
      
    if (flag == true)
    {
      System.out.println("Your average is greater than 2");
    }
     
    
    }
}