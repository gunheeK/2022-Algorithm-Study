import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
	        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                st.push(arr[0]);
            } else if (arr[i - 1] != arr[i]) {
                st.push(arr[i]);
            }
        }
        
        int[] answer = new int[st.size()];
        
        for (int i = 0; i < st.size(); i++) {
            answer[i] = st.elementAt(i);
        }
        
        return answer;
    }
}