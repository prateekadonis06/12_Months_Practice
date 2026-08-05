package week01_basics_and_arrays;
import java.util.Scanner;

public class ValidPalindrome {
   public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       String str= sc.nextLine();
       int left=0;
       int right=str.length()-1;
       while(left<right){
           if(!Character.isLetterOrDigit(str.charAt(left))){
               left++;
           }else if(!Character.isLetterOrDigit(str.charAt(right))){
               right--;

           }else{
             char ch=  Character.toLowerCase(str.charAt(left));
             char chh = Character.toLowerCase(str.charAt(right));
if(ch==chh){
    left++;
    right--;
}else {
    System.out.println("Not Palindrome");
    return;
}
           }

       }
       System.out.println("Palindrome");

    }
}
