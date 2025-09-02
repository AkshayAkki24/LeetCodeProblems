package practice;
import java.util.Arrays;
import java.util.Scanner;
public class DisplayElemnts {
    // Function to display array elements
    public static void displayElements(int[] arr, int size) {
        for(int i = 0;i<size;i++){
//            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    System.out.println(Arrays.toString(arr));
        displayElements(arr, n);
        sc.close();
    }
}
