class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        final Stack<Integer> stack = new Stack<Integer>();
        final int[] resultArr = new int[temperatures.length];

        for (int day = 0; day < temperatures.length; day++) {
            if(!stack.isEmpty() && temperatures[day] >  temperatures[stack.peek()]) {
                while(!stack.isEmpty() && temperatures[day] > temperatures[stack.peek()]) {
                    int currentDay = day;
                    int resolvedDay = stack.peek();
                    int resultDay = currentDay - resolvedDay; 
                    resultArr[stack.peek()] = resultDay;
                    stack.pop();
                }
                stack.add(day);
            } else {
                stack.add(day);
            }
        }

        return resultArr;
    } 

    //temperatures = [30, 38, 30]
}
