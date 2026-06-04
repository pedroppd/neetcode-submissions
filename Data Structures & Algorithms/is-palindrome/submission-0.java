class Solution {
    public boolean isPalindrome(String s) {
        final var arr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int begin = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[begin] == arr[end]) {
                begin ++;
                end --;
            } else {
                return false;
            }
        }
        return true;
    }
}
