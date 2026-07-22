class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int right = nums.length - 1;
            int fixedNumber = nums[i];
            int left = i + 1;

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            while(left < right) {
                int result = fixedNumber + nums[left] + nums[right];
                if(result == 0) {
                    resultList.add(Arrays.asList(fixedNumber, nums[left], nums[right]));
                    left ++;
                    right --;
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                } else if (result < 0){
                    left ++;
                }else if (result > 0) {
                    right --;
                }
            }
        }
        return resultList;
    }
}
