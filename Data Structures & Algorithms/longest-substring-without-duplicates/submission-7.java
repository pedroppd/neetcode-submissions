class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> charSet = new HashSet<>();
        final char[] arr = s.toCharArray();
        int sequence = 0;

        for(int right = 0; right < arr.length; right++) {
            while(charSet.contains(arr[right])) {
                charSet.remove(arr[left]);
                left++;
            }

            charSet.add(arr[right]);
            int sizeWindow = right - left + 1; 
            sequence = Math.max(sequence, sizeWindow);
        }

        return sequence;
    }
}
