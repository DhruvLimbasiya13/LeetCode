int singleNumber(int* nums, int numsSize) {
    if (numsSize == 1) {
        return nums[0];
    } else {
        //bubble sort
        for (int i = 0; i < numsSize - 1; i++) {
            for (int j = 0; j < numsSize - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < numsSize - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[numsSize - 1];
    }
}