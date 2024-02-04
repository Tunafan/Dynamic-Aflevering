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

  public Student get(int index) {
    if (index < 0 || index >= count) { //fejlbehandling
      throw new IndexOutOfBoundsException("Index " + index + " not found :'(");
    }
    return arr[index];
  }

  public int size() {
    return count;
  }

  // bruger count-variablens talværdi (minus 1) og sætter det indeks til 'null'.
  public void remove() {
    if (count > 0) {
      arr[--count] = null;
    } else {
      System.out.println("Cannot delete. Array is empty");
    }
  }

  public void removeIndex(int index) {
    if (index < 0 || index >= count) {
      throw new IndexOutOfBoundsException("Index " + index + " does not exist");
    }
    for (int i = index; i < count - 1; i++) {
      arr[i] = arr[i + 1];
    }

    arr[count - 1] = null;
    count--;
  }

  public void set(int index, Student student) {
    if (index >= count) {
      throw new IndexOutOfBoundsException(
        "Highest index is " + (count - 1) + ". Try that instead?"
      );
    }
    arr[index] = student;
  }

  public void clear() {
    if (count > 0) {
      for (int i = count - 1; i >= 0; i--) {
        System.out.println("Deleting student " + arr[i] + "...");
        arr[i] = null;
        System.out.println("Succesfully deleted!");
      }
      count = 0;
    }
  }
}

public class Array {

  public static void main(String[] args) {
    DynamicArray activeStudents = new DynamicArray(3);

    Student s1 = new Student(3, "Harry James Potter");
    Student s2 = new Student(3, "Ronald Beastley");
    Student s3 = new Student(3, "Hermione FrontTeeth Granger");
    Student s4 = new Student(4, "Cedric Diggory");
    Student s5 = new Student(4, "Cho Chang");
    s1.setAge(17);
    s2.setAge(17);
    s3.setAge(17);
    s4.setAge(18);
    s5.setAge(18);
    activeStudents.add(s1);
    activeStudents.add(s2);
    activeStudents.add(s3);
    activeStudents.add(s4);
    activeStudents.add(s5);
  }
}
