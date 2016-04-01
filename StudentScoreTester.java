import java.util.Scanner;
public class StudentScoreTester {
 public static void main(String[] args){
 
  String student1, student2, student3, student4, student5;
  double gpa1, gpa2, gpa3, gpa4, gpa5;
  
  //create a scanner
  
  Scanner input = new Scanner(System.in);
  
  //repeat the following 4 statements to get all five students names and gpa
  System.out.println("Please enter the name for the first student:");
  student1 = input.nextLine;
  //use scanner to get the name
  System.out.println("Please enter the GPA for the first student:");
  //use scanner to get the gpa
  gpa1 = input.nextDouble;
  
  //Student 2
  System.out.println("Please enter the name for the second student:");
  student2 = input.nextLine;
  System.out.println("Please enter the GPA for the second student:");
  gpa2 = input.nextDouble;
  
  //Student 3
  System.out.println("Please enter the name for the third student:");
  student3 = input.nextLine;
  System.out.println("Please enter the GPA for the third student:");
  gpa3 = input.nextDouble;  
  
  //Student 4
  System.out.println("Please enter the name for the fourth student:");
  student4 = input.nextLine;
  System.out.println("Please enter the GPA for the fourth student:");
  gpa4 = input.nextDouble;  
  
  //Student 5
  System.out.println("Please enter the name for the fifth student:");
  student5 = input.nextLine;
  System.out.println("Please enter the GPA for the fifth student:");
  gpa5 = input.nextDouble;  
  
  //StudentScore studentScore = new StudentScore(StudentScore(student1, gpa1, student2, gpa2, student3, gpa3, student4, gpa4, student5, gpa5)
  
  System.out.println("Student Name /" + " Student GPA");
  System.out.println("--------------------------");
  System.out.println(student1 +"   /       "+ gpa1);
  System.out.println(student2 +"   /       "+ gpa2);
  System.out.println(student3 +"   /       "+ gpa3);
  System.out.println(student4 +"   /       "+ gpa4);
  System.out.println(student5 +"   /       "+ gpa5);

  /**
   * Creates objScore object and passas in student parameters to class StudentScore...name and GPA scores
   */
  StudentScore objScore = new StudentScore(student1, gpa1, student2, gpa2, student3, gpa3, student4, gpa4, student5, gpa5);

  //calls and prints getAvg method from StudentScore.
  System.out.println("Average GPA " + objScore.getAvg());        
  //calls and prints getLowest method from StudentScore.
  System.out.println("Lowest GPA " + objScore.getLowest());        
  //calls and prints getHighest method from StudentScore.
  System.out.println("Highest GPA " + objScore.getHighest()); 
    }   
}