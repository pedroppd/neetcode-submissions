class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final var s2CharArray = s2.toCharArray();
        final var s1CharArray = s1.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> windFreq = new HashMap<>();


        int left = 0;
        for (int i = 0; i < s1CharArray.length; i++) {
            map1.put(s1CharArray[i], map1.getOrDefault(s1CharArray[i], 0) + 1);
        }

        for(int right = 0; right < s2CharArray.length; right++) {
            windFreq.put(s2CharArray[right], windFreq.getOrDefault(s2CharArray[right], 0) + 1);
            int windowSize = (right - left) + 1;

            if(windowSize == s1.length()) {
                if(windFreq.equals(map1)) {
                    return true;
                }
                
                int value = windFreq.get(s2CharArray[left]);
                if(value == 1) {
                    windFreq.remove(s2CharArray[left]);
                } else {
                    windFreq.put(s2CharArray[left], value - 1);
                }
           
                left ++;
            }

        }
        return false;
    }
}
