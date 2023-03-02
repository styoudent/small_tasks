package two_sum;

public class TwoSum {
    public static void numChecker(int[] numsToCheck, int targetSum) {
        for (int i=0; i<numsToCheck.length; i++) {
            for (int j=0; j<numsToCheck.length; j++)
                if ((numsToCheck[i] + numsToCheck[j]) == targetSum) {
                    System.out.println("Indexes: " + i + ", " + j);
                    return;
                }
        }
        System.out.println("There is no solution in this set of numbers");
    }

}
