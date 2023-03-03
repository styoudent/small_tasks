package two_sum;

public class TwoSum {
    public TwoSum() {
        final int[] givenNumbers = {1,2,3,7,11,15};
        final int targetSum = 16;
        numChecker(givenNumbers, targetSum);
    }
    private void numChecker(int[] numsToCheck, int targetSum) {
        boolean isSetFound = false;
        for (int i = 0; i < numsToCheck.length-1; i++)
            for (int j = i + 1; j < numsToCheck.length; j++)
                if (numsToCheck[i] + numsToCheck[j] == targetSum) {
                    System.out.println("Indexes: " + i + ", " + j);
                    isSetFound = true;
                }
        if (!isSetFound)
            System.out.println("There is no solution in this set of numbers");
    }
}


