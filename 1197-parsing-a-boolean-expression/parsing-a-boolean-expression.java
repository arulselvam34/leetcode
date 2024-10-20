class Solution {
        public boolean parseBoolExpr(String expression) {
        Deque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);
            if (c == ')') {
                Set<Character> seen = new HashSet<>();
                while (stk.peek() != '(')
                    seen.add(stk.pop());
                stk.pop();
                char operator = stk.pop(); 
                if (operator == '&') {
                    stk.push(seen.contains('f') ? 'f' : 't'); 
                }else if (operator == '|') {
                    stk.push(seen.contains('t') ? 't' : 'f'); 
                }else { 
                    stk.push(seen.contains('t') ? 'f' : 't'); 
                }
            }else if (c != ',') {
                stk.push(c);
            }
        }
        return stk.pop() == 't';
    }
}