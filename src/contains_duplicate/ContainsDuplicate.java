package contains_duplicate;

import java.util.Arrays;

public class ContainsDuplicate {
    public ContainsDuplicate(int[] numsToCheck) {
        boolean result = containsDuplicatesChecker(numsToCheck);
        System.out.println(result);
    }
    public boolean containsDuplicatesChecker(int[] numsToCheck) {
        for (int i = 0; i < numsToCheck.length - 1; i++)
            for (int j = i + 1; j < numsToCheck.length; j++)
                if (numsToCheck[i] == numsToCheck[j])
                    return true;
        return false;
    }
}
