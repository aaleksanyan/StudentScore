public class Student{
 
  private String name;
  private double gpa;
  
  public Student(String name, double gpa){
    this.name = name;
    this.gpa = gpa;
  }
  
  public String getName(){
    return name;
  }
  
  public double getGPA(){
    return gpa;
  }
  
  public void changeGPA(double x){
    gpa = x;
  }
                   
  
  
  
}