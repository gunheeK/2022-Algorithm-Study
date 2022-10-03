class Solution3_2 {
	public int solution(int alp, int cop, int[][] problems) {
		int maxAlp = 0, maxCop = 0, rwdApl = 0, rwdCop = 0;

		for (int i = 0; i < problems.length; i++) {
			maxAlp = Math.max(problems[i][0], maxAlp);
			maxCop = Math.max(problems[i][1], maxCop);
		}

		if (maxAlp <= alp) {
			alp = maxAlp;
		}
		if (maxCop < cop) {
			cop = maxCop;
		}

		int[][] dp = new int[maxAlp + 2][maxCop + 2];

		for (int i = alp; i <= maxAlp; i++) {
			for (int j = cop; j <= maxCop; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}

		dp[alp][cop] = 0;

		for (int i = alp; i <= maxAlp; i++) {
			for (int j = cop; j <= maxCop; j++) {
				dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + 1);
                dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + 1);


				for (int k = 0; k < problems.length; k++) {
					if (i + problems[k][2] > maxAlp)
						rwdApl = maxAlp;
					else
						rwdApl = i + problems[k][2];
					if (j + problems[k][3] > maxCop)
						rwdCop = maxCop;
					else
						rwdCop = j + problems[k][3];
					if (i >= problems[k][0] && j >= problems[k][1]) {
						dp[rwdApl][rwdCop] = Math.min(dp[rwdApl][rwdCop], dp[i][j] + problems[k][4]);
					}
				}
			}
		}
		int answer = dp[maxAlp][maxCop];
		return answer;
	}
}

public class kakao3_2 {
	public static void main(String[] args) {
		int alp = 10;
		int cop = 10;
		int[][] problems = { { 10, 15, 2, 1, 2 }, { 20, 20, 3, 3, 4 } };
		Solution3_2 s = new Solution3_2();
		int result = s.solution(alp, cop, problems);
		System.out.println(result);
	}

}

//출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges 
