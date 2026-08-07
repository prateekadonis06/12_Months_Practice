package week01_basics_and_arrays;
import java.util.Scanner;

public class Solution {

   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []nums= new int[n];
        for(int i=0;i<n;i++) {
nums[i]=sc.nextInt();

        }

            int left=0;
            int right=nums.length-2;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[mid]==nums[mid^1]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }

            }
       System.out.println(nums[left]);
        }
    }

