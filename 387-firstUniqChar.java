import java.util.Scanner;

public class Solution
{
    public int firstUniqChar(String s)
    {
        char[] a = s.toCharArray();
        int o = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {

// 尝试过很多种……emmmmm扶额摊手无奈

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
