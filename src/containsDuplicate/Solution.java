package containsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Think on 11/2/16.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums){
            if (!set.add(num))
                return true;
        }
        return false;
    }
}
