class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        int open_count = 0, close_count = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') {
                open_count++;
            } else if(c == ')' && open_count > 0) {
                open_count--;
            } else {
                close_count++;
            }
        }
        return open_count + close_count;
    }
}