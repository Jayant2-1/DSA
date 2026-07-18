package DP;

public class HouseRobber2 {

    private int robLinear(int[] nums, int start, int end) {
        int prev = 0;
        int prev2 = 0;

        for (int i = end; i >= start; i--) {
            int curr = Math.max(nums[i] + prev2, prev);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        return Math.max(
                robLinear(nums, 0, n - 2),
                robLinear(nums, 1, n - 1)
        );
    }

    public static void main(String[] args) {
        HouseRobber2 solver = new HouseRobber2();

        int[] nums = {2, 3, 2};

        System.out.println(solver.rob(nums)); // Output: 3
    }
}