class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }

        final char[] sArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < sArray.length; i++) {
            Character index = sArray[i];
            map.put(index, map.getOrDefault(index, 0) + 1);
        }

        final char[] tArray = t.toCharArray();
        for(int j = 0; j < tArray.length; j++) {
           map.put(tArray[j], map.getOrDefault(tArray[j], 0) - 1);
           if(map.get(tArray[j]) < 0) {
                return false;
           }
        }
        return true;
    }
}
