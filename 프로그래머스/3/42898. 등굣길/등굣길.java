import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int mod = 1000000007;
        int [][] dp = new int[n + 1][m + 1]; 
        
        // 웅덩이 구간 표시
        for (int[] puddle : puddles)
           dp[puddle[1]][puddle[0]] = -1; // [y][x]
        
        dp[1][1] = 1;
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                // 웅덩이 구간이면 건너 뜀
                if(dp[i][j] == -1) 
                    continue;
                 // 위쪽에서 올 수 있는 경우
                if(dp[i - 1][j] > 0)
                    dp[i][j] += dp[i - 1][j] % mod;
                // 왼쪽에서 올 수 있는 경우
                if(dp[i][j - 1] > 0)
                    dp[i][j] += dp[i][j - 1] % mod;
            }
        }
        
        answer = dp[n][m] % mod;
        return answer;
    }
}