import java.util.Arrays;

class SimpleSort {
  

  public static void main(String[] args) {
   
    System.out.println("Simple Sort"); 
    
    int[] arr1 = {0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0}; 
    int[] arr2 = {1, 3, 5, 10, 2, 1, 4, 3, 8};   
    System.out.println(Arrays.toString(sort(arr1)));

    System.out.println(Arrays.toString(arr2));
    bubbleSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
  
  public static int add(int a, int b) {
    return a + b;
  }
  
  public static int[] sort(int[] arr) {
    int cnt = 0;
    int n = arr.length;
    System.out.println(arr.length);
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        cnt++;
      }
    }

    for (int i = 0; i < n; i++) {
      if (i < cnt) {
        arr[i] = 0;
      } else {
        arr[i] = 1;
      }
    }
   return arr;
  }

  public static void bubbleSort(int[] arr) {
    boolean swapped = true;
    int j = 0;
    int tmp;
    while (swapped) {
      swapped = false;
      j++;
      for (int i = 0; i < arr.length - j; i++) {
        if (arr[i] > arr[i+1]) {
          tmp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = tmp;
          swapped = true;
        } 
      } 
    }
  }

}
