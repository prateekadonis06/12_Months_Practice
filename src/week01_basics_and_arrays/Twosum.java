package week01_basics_and_arrays;


import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int arr[]={12,34,9,21,87,78,764};
        int target=43;
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int check=arr[left]+arr[right];
            if(check==target){
                System.out.println(" the following index number lead to the sum of the target value "+left+" "+right);
                return;
            }else if(check<target){
                left++;
            }else {
                right--;
            }
        }
        System.out.println("not found");
        return;


    }
}
