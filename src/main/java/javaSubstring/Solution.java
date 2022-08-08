package javaSubstring;

import java.util.*;

public class Solution {

    public static void substring(String x, int a,int b){
        System.out.println(x.substring(a,b));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        substring(S,start,end);

    }

    }

