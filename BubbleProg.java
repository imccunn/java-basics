import java.util.Scanner;
import java.util.Arrays; 

class BubbleProg {
  public static void main(String[] args) {
    System.out.println("Input number of integers to sort:");
    int n;
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.println("Enter " + n + " integers.");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(arr));
  }
}
