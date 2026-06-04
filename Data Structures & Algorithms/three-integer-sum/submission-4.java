class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        List<List<Integer>> ints = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            while(left < right) {
                int result = nums[right] + nums[left] + nums[i];
                if(result == 0) {
                    ints.add(Arrays.asList(nums[i], nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                } else if(result < 0) {
                    left ++;
                } else if(result > 0) {
                    right --;
                }
            }
        }
        return ints;
    }
}
