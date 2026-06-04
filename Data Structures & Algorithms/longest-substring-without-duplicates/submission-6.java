class Solution {

    public int lengthOfLongestSubstring(String s) {
        final var arr = s.toCharArray();

        int left = 0;

        int bigger = 0;

        Set<Character> setLocal = new HashSet<>();
        for(int right = 0; right < arr.length; right++) {
            while(setLocal.contains(arr[right])) {
                setLocal.remove(arr[left]);
                left++;
            }
            setLocal.add(arr[right]);
            bigger = Math.max(bigger,right - left + 1);
        }
        return bigger;
    }
}
