import java.util.*;
import java.util.ArrayList;
public class solutonOfThreeSim {
       public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0){
                break;
            }
            int lo = i + 1, hi = nums.length - 1;
            if(i == 0 || i > 0 && nums[i] != nums[i - 1]){
                while(lo < hi){
                    int sum = nums[i] + nums[lo] + nums[hi];                            
                    if(sum == 0){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        lo++;
                        hi--;
                        // skip duplicate
                        while(lo < hi && nums[lo] == nums[lo - 1]){
                            lo++;
                        }
                        while(lo < hi && nums[hi] == nums[hi + 1]){
                            hi--;
                        }                
                    }else if(sum < 0){
                        lo++;
                    }else{
                        hi--;
                    }
                }
            }

        }
            return res;
    } 
}
