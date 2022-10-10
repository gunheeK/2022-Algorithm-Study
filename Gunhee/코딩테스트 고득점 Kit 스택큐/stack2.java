import java.util.*;

class Solution_s2 {
	boolean solution(String s) {
		boolean answer = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('('))
                stack.push('(');
            else {
                if (stack.empty() || stack.peek() != '(')
                    return false;
                stack.pop();
            }
        }
        if (stack.empty())
            answer = true;
        return answer;
	}
}

/*public class stack2 {
	public static void main(String[] args) {
		String s1 = "()()";
		Solution_s2 s = new Solution_s2();
		System.out.println(s.solution(s1));
	}

}*/

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges