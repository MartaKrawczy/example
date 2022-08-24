package comparisonSubstring;

import java.util.*;

/*
We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values
Sample Input 0

welcometojava
3

Sample Output 0
ava
wel
*/
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> substrings = new ArrayList<>();
        for(int i=0; i<=s.length()-k; i++){
            substrings.add(s.substring(i, i+k));
        }
        Collections.sort(substrings);
        return substrings.get(0) + "\n" + substrings.get(substrings.size()-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
