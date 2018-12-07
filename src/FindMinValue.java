import java.util.Arrays;
import java.util.Scanner;

public class FindMinValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter size of array: ");
    int sizeOfArray = scanner.nextInt();
    int[] arr = new int[sizeOfArray];

    System.out.println("Please, enter value of elements in array:");
    for (int i = 0; i < sizeOfArray; i++) {
      System.out.println("Elements["+i+"]");
      arr[i] = scanner.nextInt();
    }

    System.out.println("Your array:");
    System.out.println(Arrays.toString(arr));

    int index = minValue(arr);
    System.out.println("The smallest value of elements in the array is: " + arr[index]);
  }

  public static int minValue(int[] array) {
    int min = array[0];
    int index = 0;

    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
        index = i;
      }
    }

    return index;
  }
}