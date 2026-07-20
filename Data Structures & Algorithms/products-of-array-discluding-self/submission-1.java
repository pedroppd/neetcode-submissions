class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        final int[] left = new int[nums.length];
        final int[] right = new int[nums.length];
        final int[] result = new int[nums.length];

        // 1 2 4 6

        //1,1,2,8
        //1,6,24,48
        //1,6,48,384

        for (int i = 0; i < nums.length; i++) {
            if(i ==  0) {
                left[i] = 1;
            } else {
                left[i] = nums[i - 1] * left[i - 1];
            }
        }


        for (int j = nums.length - 1; j >= 0 ; j--) {
            if(j == nums.length - 1) {
                right[j] = 1;
            } else {
                right[j] = nums[j + 1] * right[j + 1];
            }
        }

        for(int i = 0; i < result.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}  
