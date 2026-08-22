class Solution {
    public int lengthOfLongestSubstring(String s) {
        final var arr = s.toCharArray();
        int left = 0;
        int result = 0;
        Set<Character> sets = new HashSet<>();

        for(int right = 0; right < arr.length; right++) {
            if(sets.contains(arr[right])) {
                while(sets.contains(arr[right])) {
                    sets.remove(arr[left]);
                    left ++;
                }    
            } 
            result = Math.max(result, (right - left) + 1);
            sets.add(arr[right]);
        }
        return result;
    }
}
