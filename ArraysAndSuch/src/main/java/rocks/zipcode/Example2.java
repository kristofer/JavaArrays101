package rocks.zipcode;

class Example3 {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int[] doubledArr = doubleArr(arr);
      int[] quadArr = doubleArr(doubledArr);
  
      printArr(arr);
      printArr(doubledArr);
      printArr(quadArr);
    }
  
    public static int[] doubleArr(int[] arr) {
      int[] doubled = new int[arr.length];
      for(int i = 0; i < arr.length; i++) {
        doubled[i] = arr[i] * 2;
      }
      return doubled;
    }
  
    public static void printArr(int[] arr) {
      for(int item : arr) {
        System.out.print(item + " ");
      }
      System.out.println();
    }
}


public class Example2 {

    public static void main(String[] args) {
  
      int[] arr = {1, 2, 3, 4, 5};
      int[] doubledArr = new int[arr.length];
  
      for(int i = 0; i < arr.length; i++) {
        doubledArr[i] = arr[i] * 2;
      }
  
      int[] quadArr = new int[arr.length];
  
      for(int i = 0; i < arr.length; i++) {
        quadArr[i] = doubledArr[i] * 2;
      }
  
      for(int item : arr) {
        System.out.print(item + " ");
      }
      System.out.println();

      for(int item : doubledArr) {
        System.out.print(item + " ");
      }
      System.out.println();

      for(int item : quadArr) {
        System.out.print(item + " ");
      }
      System.out.println();
    }
  }