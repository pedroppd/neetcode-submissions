class Solution {
    public boolean isAnagram(String s, String t) {
        final var sArr = s.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        for(int i = 0 ; i < sArr.length; i++) { 
            map1.put(sArr[i], map1.getOrDefault(sArr[i], 0) + 1);
        }

        final var tArr = t.toCharArray();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int j = 0 ; j < tArr.length; j++) {
            map2.put(tArr[j], map2.getOrDefault(tArr[j], 0) + 1);
        }

        return map2.equals(map1);
    }
}
