class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(!stack.isEmpty() 
                && Character.toLowerCase(stack.peek()) == Character.toLowerCase(ch)
                && Character.isUpperCase(stack.peek()) != Character.isUpperCase(ch)) {
                    stack.pop();
            } else {
                    stack.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        for(char ch : stack) {
            res.append(ch);
        }
        return res.toString();
    }
}