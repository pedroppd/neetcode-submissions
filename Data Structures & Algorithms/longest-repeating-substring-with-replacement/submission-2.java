class Solution {
    public int characterReplacement(String s, int k) {
        final var arr = s.toCharArray();
        Integer biggestSize = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            int sizeWindow = (right + 1) - left;
            maxFreq = Math.max(maxFreq, map.get(arr[right]));
            int numberK = sizeWindow - maxFreq;

            if (numberK == k) {
                biggestSize = Math.max(sizeWindow, biggestSize);
            } else if (numberK > k) {
                while(numberK > k) {
                    map.put(arr[left], map.get(arr[left]) - 1);
                    left ++;
                    numberK --;
                }  
            }
        }
        return biggestSize == 0 ? arr.length : biggestSize;
    }
}
