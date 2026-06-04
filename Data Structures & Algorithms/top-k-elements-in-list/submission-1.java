class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length <= 1) {
            return nums;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] output = new int[k];

        final var finalList = map.entrySet()
            .stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .map(Map.Entry::getKey)
            .toList();

        for (int i = 0; i < k; i++) {
            output[i] = finalList.get(i);
        }

        return output;
    }
}