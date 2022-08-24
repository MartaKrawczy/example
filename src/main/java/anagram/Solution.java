package anagram;

//not case-sensitive

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String a = scan.nextLine().toUpperCase();
        String b = scan.nextLine().toUpperCase();

        System.out.println(anagram(a,b));
    }

    public static String anagram(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        if (Arrays.equals(a1,b1)){
            return "Anagrams";
        } else
            return "Not Anagrams";

    }
}
