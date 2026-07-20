class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int result = 0;
        if(nums.length <= 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if(set.size() <= 1) {
            return 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i] - 1)) {
                int count = 1;
                int curr = nums[i];
                while(set.contains(curr + 1)) {
                   curr ++;
                   count ++;
                }
               result = Math.max(result, count);
            }
        }

        return result;
    }
}
