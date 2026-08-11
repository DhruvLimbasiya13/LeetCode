int missingInteger(int* nums, int numsSize) {

    int result[numsSize] ;
    int count = 0;

    result[count++] = nums[0];

    for (int i = 0; i < numsSize - 1; i++) {
        if (nums[i + 1] == nums[i] + 1) {
            result[count++] = nums[i + 1];
        } else {
            break;
        }
    }

    int sum = 0;
    for (int i = 0; i < count; i++) {
        sum += result[i];
    }

    while (1) {
        int found = 0;

        for (int i = 0; i < numsSize; i++) {
            if (nums[i] == sum) {
                found = 1;
                break;
            }
        }

        if (!found)
            return sum;

        sum++;
    }
}