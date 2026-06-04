class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];

        //[1, 2, 4, 6]

        //left
        for (int i = 0; i < nums.length; i++) {
            if(i == 0) {
                left[i] = 1;
            } else if (i == 1) {
                left[i] = left[0] * nums[i - 1];
            } else {
                int prod = 1;
                for (int j = 0; j < i; j++) {
                    prod = prod * nums[j];
                }
                left[i] = prod;
            }
        }

       // [1, 2, 4, 6]
        for (int i = nums.length - 1; i >= 0; i--) {
            if(i == nums.length - 1) {
                right[i] = 1;
            } else if (i ==  nums.length - 2) {
                right[i] = right[nums.length - 1] * nums[i + 1];
            } else {
                int prod = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    prod = prod * nums[j];
                }
                right[i] = prod;
            }
        }
        
        for (int i = 0; i < right.length; i++) {
            output[i] = right[i] * left[i];
        }
        
        return output;
    }
}  
