class DynamicArray {

  private Student arr[];
  private int count;

  public DynamicArray(int length) {
    arr = new Student[length];
  }

  public void printArray() {
    for (int i = 0; i < count; i++) {
      System.out.println(
        arr[i].getFullName() +
        ", age: " +
        arr[i].getAge() +
        ", school year: " +
        arr[i].getSchoolYear()
      );
    }
  }

  public void add(Student student) {
    if (arr.length == count) {
      Student newArr[] = new Student[2 * count];

      for (int i = 0; i < count; i++) {
        newArr[i] = arr[i];
      }
      arr = newArr;
    }
    arr[count++] = student;
  }
}

public class Array {

  public static void main(String[] args) {
    DynamicArray activeStudents = new DynamicArray(3);
  }
}


Student s1 = new Student(3, "Harry James Potter");
Student s2 = new Student(3, "Ron Weasley");
Student s3 = new Student(3, "Hermione FrontTeeth Granger");
s1.setAge(18);
s2.setAge(18);
s3.setAge(17);

DynamicArray activeStudents = new DynamicArray(3);

activeStudents.add(s1);
activeStudents.add(s2);
activeStudents.add(s3);

// System.out.println("Array contains " + activeStudents.size() + " elements");  // skriver at der er 3
// System.out.println("#0: " + activeStudents.get(0));   // Udskriver Harry
// System.out.println("#1: " + activeStudents.get(1));   // Udskriver Ron
// System.out.println("#2: " + activeStudents.get(2));   // Udskriver Hermione

// activeStudents.remove(1);

// System.out.println("Array contains " + activeStudents.size() + " elements");  // skriver at der er 2
// System.out.println("#0: " + activeStudents.get(0));   // Udskriver Harry
// System.out.println("#1: " + activeStudents.get(1));