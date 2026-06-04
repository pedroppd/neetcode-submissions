class Solution {

    public boolean hasDuplicate(int[] nums) {
        List<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
           if(duplicate.contains(nums[i])) {
            return true;
           }
           duplicate.add(nums[i]);
        }
        return false;
    }
}