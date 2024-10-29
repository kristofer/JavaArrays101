package rocks.zipcode;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        App app = new App();

        //app.doArrayStuff();

        System.out.println("avg "+app.avg(1, 2, 3, 4, 5));
        System.out.println("avg "+app.avg(4, 5));
        System.out.println("avg "+app.avg(2, 3, 5, 7, 11, 13, 17, 19, 23, 2, 3, 5, 7, 11, 13, 17, 19, 57, 102, 63));

        System.out.printf("%s %d %f %f %f %f \n", "Kris", 14, 2.4, 5.5, 6.2, 0.00000004);
    }

    public static int avg(int... values) {
        int sum = 0;
        for(int value : values) {
          sum += value;
          System.out.print(value+ " ");
        }
        return sum / values.length;
    }

    public void doArrayStuff() {

        ArrayList<Integer> intArrList1 = new ArrayList<>();

        ArrayList<Double> intArrList2 = new ArrayList<>();

        ArrayList<Integer> intArrList = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            intArrList.add(i);
        }

        String[] playerNames = new String[6];

        playerNames[0] = "Jill";
        // more etc...
        playerNames[5] = "Aleksandar";
        System.out.println("Length is "+playerNames.length);

        for (String element : playerNames) {
            System.out.println(element);
        }

        int[] smallPrimes = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };

        System.out.println("smallPrimes Length is "+smallPrimes.length);
        // for (int element : smallPrimes) {
        //     System.out.println(element);
        // }

        printArray(smallPrimes);

        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12; // now smallPrimes[5] is also 12

        printArray(luckyNumbers);
        printArray(smallPrimes);
        //printArray(new int[] { 17, 19, 23, 29, 31, 37 });

        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);


        System.out.println("FINISHED.");

    }

    public void printArray(int[] foo) {
        System.out.println("Start");
        for (int element : foo) {
            System.out.println(element);
        }
        System.out.println("End.");

    }
}


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


class Example2 {

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