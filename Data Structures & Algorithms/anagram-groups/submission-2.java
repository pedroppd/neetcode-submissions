class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String value : strs) {
            var arrayChar = value.toCharArray();
            Arrays.sort(arrayChar);
            String newValue = new String(arrayChar);
            map.putIfAbsent(newValue, new ArrayList<String>());
            map.get(newValue).add(value);
        }
        return new ArrayList<>(map.values());
    }
}
