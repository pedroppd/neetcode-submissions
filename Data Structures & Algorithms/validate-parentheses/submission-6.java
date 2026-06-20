class Solution {
    public boolean isValid(String s) {
        final var arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(') {
                stack.push(')');

            } else if(arr[i] == '[') {
                stack.push(']');

            } else if(arr[i] == '{') {
                stack.push('}');

            } else if (!stack.isEmpty() && arr[i] == stack.peek()) {
                stack.pop();
            } else {
                return false;
            } 
        }
        return stack.isEmpty();
    }
}
