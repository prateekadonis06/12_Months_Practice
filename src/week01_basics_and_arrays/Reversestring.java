package week01_basics_and_arrays;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int a = 0;
        int b = ch.length - 1;

        while (a < b) {
            char temp = ch[a];
            ch[a] = ch[b];
            ch[b] = temp;

            a++;
            b--;
        }

        String reversedStr = new String(ch);
        System.out.println(reversedStr);
    }
}
