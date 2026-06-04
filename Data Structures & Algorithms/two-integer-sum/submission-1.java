class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        if(nums.length < 2) {
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer rest = target - nums[i];
            if(map.containsKey(rest)) {
                result[0] = map.get(rest);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i); 
        }
        return result;
    }
}
