package two_sum;

import java.util.Arrays;

public class TwoSum {
    public TwoSum(int[] numsToCheck, int targetSum) {
        int[] result = twoSumChecker(numsToCheck, targetSum);
        System.out.println(Arrays.toString(result));
    }
    private int[] twoSumChecker(int[] numsToCheck, int targetSum) {
        int[] equalNumsIndexes = new int[2];
        for (int i = 0; i < numsToCheck.length - 1; i++)
            for (int j = i + 1; j < numsToCheck.length; j++)
                if (numsToCheck[i] + numsToCheck[j] == targetSum) {
                    equalNumsIndexes[0] = i;
                    equalNumsIndexes[1] = j;
                    return equalNumsIndexes;
                }
        return equalNumsIndexes;
    }
}


