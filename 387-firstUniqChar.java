/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
*/

import java.util.Scanner;

public class Solution
{
    public int firstUniqChar(String s)
    {
        char[] a = s.toCharArray();
        int o = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {

// 尝试过很多种……emmmmm扶额摊手无奈状 但这个明明看起来很简单啊哭

            }
        }
        return o;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Solution eng = new Solution();
        System.out.println(eng.firstUniqChar(s));
    }

}
