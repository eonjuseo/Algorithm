import java.util.*;
class Solution {
    boolean[] visited;
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, 0, dungeons);      
        
        return answer;
    }
    
    public void dfs(int k, int depth, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
           if(!visited[i] && dungeons[i][0] <= k) {
               visited[i] = true;
               dfs(k - dungeons[i][1], depth + 1, dungeons);
               visited[i] = false;
           }
        }
        
        answer = Math.max(depth, answer);
    }
}