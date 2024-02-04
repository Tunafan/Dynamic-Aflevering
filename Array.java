public class Array {

  private int arr[];
  private int count;

  public Array(int length) {
    arr = new int[length];
  }

  public void printArray() {
    for (int i = 0; i < count; i++) {
      System.out.println(arr[i] + "");
    }
  }

  public void insert(int element) {
    if (arr.length == count) {
      int newArr[] = new int[2 * count];

      for (int i = 0; i < count; i++) {
        newArr[i] = arr[i];
      }
      arr = newArr;
    }
    arr[count++] = element;
  }
}
