package stringsIntroduction;

import java.util.*;

/*
Input Format

The first line contains a string
. The second line contains another string

. The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of
and .
For the second line, write Yes if is lexicographically greater than otherwise print No instead.
For the third line, capitalize the first letter in both and and print them on a single line, separated by a space.
 */

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        lenght(A,B);
        larger(A,B);
        capitalizeFirstLetter(A,B);
        /* Enter your code here. Print output to STDOUT. */
    }

    private static void lenght(String a, String b){
        System.out.println(a.length()+b.length());
    }

    private static void larger(String a, String b){
        System.out.println(a.compareTo(b)>0?"Yes":"No");

    }

    private static void capitalizeFirstLetter(String a, String b){
       char c = a.toUpperCase().charAt(0);
       char [] arra = a.toCharArray();
        System.out.print(c);
        for (int i = 1; i < a.length(); i++) {
            System.out.print(arra[i]);
        }
        System.out.print(" ");

        char d = b.toUpperCase().charAt(0);
        char [] arrb = b.toCharArray();
        System.out.print(d);
        for (int i = 1; i < b.length(); i++) {
            System.out.print(arrb[i]);
        }

    }

}
