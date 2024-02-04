public class Student extends Person {

  public int schoolYear;

  // constructors

  public Student(String firstName, String lastName) {}

  public Student(String firstName, String middleName, String lastName) {}

  public Student(String fullName) {
    setFullName(fullName);
  }

  public Student(Student other) {}

  public Student(
    int schoolYear,
    String firstName,
    String middleName,
    String lastName
  ) {
    super(firstName, middleName, lastName);
    this.schoolYear = schoolYear;
  }

  public Student(int schoolYear, String fullName) {
    super(fullName);
    this.schoolYear = schoolYear;
  }

  public Student() {}

  // getters and setters
  public int getSchoolYear() {
    return schoolYear;
  }

  public void setSchoolYear(int schoolYear) {
    this.schoolYear = schoolYear;
  }
}
