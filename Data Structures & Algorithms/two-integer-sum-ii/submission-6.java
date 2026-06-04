class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int rigth = numbers.length - 1;

        while(left < rigth) {
            int result = numbers[left] + numbers[rigth];
            if(result > target) {
                rigth --;
            } else if (result < target){
                left ++;
            } else {
                return new int[] {left + 1, rigth + 1};
            }
        }
        return new int[]{};
    }
}
