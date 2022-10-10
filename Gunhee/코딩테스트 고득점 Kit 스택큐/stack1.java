import java.util.*;

public class stack1 {
	public int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && stack.peek().equals(arr[i]))
                continue;
            stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[answer.length - 1 - j] = stack.pop();
        }
        return answer;
	}
	
	/*public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		stack1 s = new stack1();
		int[] answer = s.solution(arr);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i] + " ");
		}
	}*/

}

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges