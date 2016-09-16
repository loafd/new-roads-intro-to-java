  import java.util.Scanner;

public class ComputeGrade{

  public static void main (String[] args){
    //setup scanner
    Scanner input = new Scanner(System.in);
    //promt for name
    System.out.println("What is your name?");
    //get name
    String name = input.next();
    //prompt user for grades
    System.out.println("Enter your percent grade for test one: ");
    //get grades
    double grade1 = input.nextDouble();
    //prompt user for grades
    System.out.println("Enter percent grade for test two: ");
    //get grades
    double grade2 = input.nextDouble();
    //prompt user for grades
    System.out.println("Enter percent grade for test three: ");
    //get grades
    double grade3 = input.nextDouble();
    //find average
    double sum = grade1 + grade2 + grade3;
    double answer = sum / 3;
    System.out.println("The average of your grades is: " + answer);
    String finalGrade = name + "'s final grade is " + getLetterGrade( answer);
    
    System.out.println(finalGrade);
  }
  public static char getLetterGrade(double answer){
      //figure out letter grades
   if (answer >= 90)
   {
     return 'A';
   }
   else if (answer >= 80 && answer <= 90)
   {
     return 'B';
   }
   else if (answer >= 70 && answer <= 80)
   {
     return 'C';
   }
   else if (answer >= 60 && answer <= 70)
   {
     return 'D';
   }
     return 'F';
  }
}