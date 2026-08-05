class Solution {
    public int longestConsecutive(int[] nums) {
        final Set<Integer> set = new HashSet<>();
        Integer sequence = 0;
        for (var num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if(!set.contains(nums[i] - 1)) {
                int countNumber = nums[i] + 1;
                //if(set.contains(count + 1)) {
                    int curr = nums[i];
                    while(set.contains(curr + 1)) {
                        count ++;
                        curr ++;
                    }
                //}
            } 
            sequence = Math.max(sequence, count);
        }

        return sequence;
    }
}
