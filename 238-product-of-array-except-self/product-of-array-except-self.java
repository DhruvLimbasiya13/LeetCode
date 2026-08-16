class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Store product of all elements to the left
        int left = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = left;
            left *= nums[i];
        }

        // Multiply with product of all elements to the right
        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }
}