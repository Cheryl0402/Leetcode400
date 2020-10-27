class Solution {
    public int[] twoSum(int[] nums, int target) {       
        //Solution 1: brute force.
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }            
        }
        return null; 
        // solution 1 we need to iterate the rest of the arry for each number in the array
        // the worse time complexity is n(n-1) --> O(N^2);
        //Space complexity is O(1); 
        
        // Solution 2: use hash map
        // if we detect one value that equals to target - the number
        // then we know the value and the num we are iterating is the pair
        // we return the index of the pair.
        // else put the number and index to the map if no pair found.
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return null;
        // throw new RuntimeException("No Solution");
        
        //In this way, we only need to iterate the array once. So the time complexity is O(N);
        // Space complexity is O(N);
    }
}
