class Solution {
    public boolean checkInclusion(String s1, String s2) {

        final var arrS2 = s2.toCharArray();
        final var arrS1 = s1.toCharArray();
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> windfreq = new HashMap<>();
        Integer left = 0;
        Integer windSize = 0;
        boolean isPermutation = false;

        for(int i = 0; i < s1.length(); i++) {
            freq.put(arrS1[i], freq.getOrDefault(arrS1[i], 0) + 1);
        }

        for (int right = 0; right < arrS2.length; right++) {
            windSize = (right - left) + 1;
            windfreq.put(arrS2[right], windfreq.getOrDefault(arrS2[right], 0) + 1);

          if (windSize == s1.length()) {
                if(freq.equals(windfreq)) {
                    isPermutation = true;
                    break;
                }
                int value = windfreq.get(arrS2[left]);
                if(value == 1) {
                    windfreq.remove(arrS2[left]);
                } else {
                    windfreq.put(arrS2[left], value - 1);
                }
                left ++;
            }
        }
        return isPermutation;
    }
}
