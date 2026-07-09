class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String token: tokens) {
            if(isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int value1 = stack.pop();
                int value2 = stack.pop();
                int total = evaluate(value2, value1, token);
                stack.push(total);
            }
        }
        return stack.pop();
    }

    public static int evaluate(final Integer value1, final Integer value2, final String operator) {
        if(operator.equals("-")) {
            return value1 - value2;
        }
        if(operator.equals("/")) {
            return value1 / value2;
        }   
        if(operator.equals("+")) {
            return value1 + value2;
        }   
        if(operator.equals("*")) {
            return value1 * value2;
        }  
        return 0;
    }

    public static boolean isNumeric(final String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch(Exception ex) {
            return false;
        }
    }
}
