package revers;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(Revers(A));
    }

    public static String Revers(String a){
        StringBuffer b = new StringBuffer(a);
        String c = b.reverse().toString();
       if( c.equals(a))
       {
           return "Yes";
       } else
        return "No";
    }
}
