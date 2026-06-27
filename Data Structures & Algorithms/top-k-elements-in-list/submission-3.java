class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        final int[] result = new int[k];
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        final List<Integer> listSorted = map.entrySet()
        .stream()
        .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
        .map(Map.Entry::getKey)
        .toList();

        for (int i = 0; i < k; i++) {
            result[i] = listSorted.get(i);
        }

        return result;
    }
}
