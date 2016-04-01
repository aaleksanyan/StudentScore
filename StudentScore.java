public class StudentScore{
  
  private String student1, student2, student3, student4, student5;
  private double gpa1, gpa2, gpa3, gpa4, gpa5;
  public Student studentone, studenttwo, studentthree, studentfour, studentfive = null;
  
  public StudentScore(String student1, double gpa1, String student2, double gpa2, String student3, double gpa3, String student4, double gpa4, String student5, double gpa5){
    this.student1=student1;
    this.student2=student2;
    this.student3=student3;
    this.student4=student4;
    this.student5=student5;
    this.gpa1=gpa1;
    this.gpa2=gpa2;
    this.gpa3=gpa3;
    this.gpa4=gpa4;
    this.gpa5=gpa5;
    Student studentone = new Student(student1, gpa1);
    Student studenttwo = new Student(student2, gpa2);
    Student studentthree = new Student(student3, gpa3);
    Student studentfour = new Student(student4, gpa4);
    Student studentfive = new Student(student5, gpa5);
  } 

  public double getAvg(){
    double total = (gpa1 + gpa2 + gpa3 + gpa4 + gpa5);
    double avg = (total/5.0);
    return avg;
  }

  public String getHighest(){
    Student max = studentone;
    for(int i = 0; {
      
    
    }
  }

}