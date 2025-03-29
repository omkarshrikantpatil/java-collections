public class MyClass {

  private String studentName;
  private int studentGpa;

  public MyClass(String studentName, int studentGpa){
    this.studentName = studentName;
    this.studentGpa = studentGpa;
  }
  public int getStudentGpa() {
    return studentGpa;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public void setStudentGpa(int studentGpa) {
    this.studentGpa = studentGpa;
  }
}
