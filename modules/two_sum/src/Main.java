import two_sum.TwoSum;
import variables.FixedVariables;


public class Main {
    public static void main(String[] args) {
        FixedVariables variables = new FixedVariables();
        TwoSum two_sum = new TwoSum(variables.getNumsToCheck(), variables.getTargetSum());
    }
}