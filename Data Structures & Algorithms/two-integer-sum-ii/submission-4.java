class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i  = 0; i < numbers.length; i++) {
            int result = target - numbers[i];
            if(map.get(numbers[i]) != null) {
                return new int[] {map.get(numbers[i]) + 1, i + 1};
            }
            map.put(result, i);
        }
        return new int[]{};
    }
}
