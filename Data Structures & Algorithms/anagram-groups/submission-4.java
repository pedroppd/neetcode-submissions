class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            final var charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);

            if(map.get(sortedString) == null) {
                List<String> list = new ArrayList<>(Arrays.asList(strs[i]));
                map.put(sortedString, list);
            } else {
                map.get(sortedString).add(strs[i]);
            }
        }

        for (List<String> value : map.values()) {
            result.add(value);
        }
    
        return result;
    } 
}

