package week01_basics_and_arrays;
import java.util.Scanner;
public class Rotationarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();  /*for number of rotation*/
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static void reverse(int[] num, int left, int right) {
        while (left > right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;

            left++;
            right--;
        }
    }
}