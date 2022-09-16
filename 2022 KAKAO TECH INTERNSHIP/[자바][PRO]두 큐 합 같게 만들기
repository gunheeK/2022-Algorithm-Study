import java.util.LinkedList;
import java.util.Queue;

class Solution1 {
    public int solution(int[] queue1, int[] queue2) {
    	Queue<Integer> qArray1 = new LinkedList<Integer>();
    	Queue<Integer> qArray2 = new LinkedList<Integer>();
    	long sum1 = 0;
    	long sum2 = 0;
    	
    	int answer = 0;
    	
    	for(int i = 0; i < queue1.length; i++) {
    		qArray1.add(queue1[i]);
    		qArray2.add(queue2[i]);
    		sum1 += queue1[i];
    		sum2 += queue2[i];
    	}
    	
    	for (int i = 0; i < queue1.length * 3; i++) {
    		if (sum1 == sum2)
    			return answer;
    		
    		if(sum1 < sum2) {
    			qArray1.add(qArray2.peek());
    			sum1 += qArray2.peek();
    			sum2 -= qArray2.peek();
    			qArray2.remove();
    			answer++;
    		}
    		else {
    			qArray2.add(qArray1.peek());
    			sum1 -= qArray1.peek();
    			sum2 += qArray1.peek();
    			qArray1.remove();
    			answer++;
    		}
    	}
        return -1;
    }
}

/*public class kakao2 {

	public static void main(String[] args) {
		int count = 0;
		Solution1 s = new Solution1();
		int[] queue1 = {3, 2, 7, 2};
		int[] queue2 = {4, 6, 5, 1};
		count = s.solution(queue1, queue2);
		System.out.println(count);

	}

}*/

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
