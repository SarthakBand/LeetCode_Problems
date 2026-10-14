class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<Character>();
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			char ele = s.charAt(i);
			if (stk.isEmpty()) {
				stk.push(ele);
			} else if (stk.peek() != ele) {
				stk.push(ele);
			} else {
				stk.pop();
			}
		}
		for(char c : stk) {
			stringBuilder.append(c);
		}
		return stringBuilder.toString();
    }
}