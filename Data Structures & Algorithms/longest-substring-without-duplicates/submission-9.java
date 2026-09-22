class Solution {
    public int lengthOfLongestSubstring(String s) {
        var arr = s.toCharArray();
        int result = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < arr.length; right++) {
            while(set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
