class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            int numberOfTime = map.getOrDefault(s.charAt(i), 0) + 1;
            map.put(s.charAt(i), numberOfTime);
        }
        
        for(int i = 0; i < t.length(); i++) {
            int numberOfTime = map.getOrDefault(t.charAt(i), 0) - 1;
            map.put(t.charAt(i), numberOfTime);
            if(map.get(t.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }
}
