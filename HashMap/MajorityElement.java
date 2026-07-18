package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int @org.jetbrains.annotations.NotNull [] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        int count =0;
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);

            if(mp.get(nums[i]) > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}
