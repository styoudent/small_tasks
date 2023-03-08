import universal_data_for_functions.FixedVariables;
import contains_duplicate.ContainsDuplicate;
import two_sum.TwoSum;

public class Main {
    public static void main(String[] args) {
        FixedVariables variables = new FixedVariables();
        TwoSum two_sum = new TwoSum(variables.getNumsToCheck(), variables.getTargetSum());
        ContainsDuplicate contains_duplicate = new ContainsDuplicate(variables.getNumsToCheck());


    }
}