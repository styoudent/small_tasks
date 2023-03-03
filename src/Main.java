import two_sum.VariablesForTwoSum;
import two_sum.TwoSum;

public class Main {
    public static void main(String[] args) {
        VariablesForTwoSum variables = new VariablesForTwoSum();
        TwoSum two_sum = new TwoSum(variables.getNumsToCheck(), variables.getTargetSum());
    }
}