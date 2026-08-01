package week01_basics_and_arrays;

public class Reversearray {
   public static void main() {


       int arr[]={12, 34, 56, 343, 54};
       int left=0;
       int right=arr.length-1;

       while(left<right){
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
       }
       for(int num:arr){
           System.out.print(num+" ");
       }

    }
}
