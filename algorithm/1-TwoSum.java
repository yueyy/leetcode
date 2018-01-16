import java.util.Scanner;

public class Solution {
    public static int[] twoSum(int[] nums, int target){
        int[] output = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(target == nums[i] + nums[j] && j!=i){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}
