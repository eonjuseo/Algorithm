import java.util.*;

class Solution {
    List<String> result = new ArrayList<>();
    boolean[] visited;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        dfs(tickets, 0, "ICN", "ICN"); // 티켓 리스트, 사용한 항공권의 수, 현재 위치, 방문 순서 
        Collections.sort(result); // 
        
        String[] answer = result.get(0).split(" "); 
        return answer; 
    }

    void dfs(String[][] tickets, int cnt, String current, String path) {
        if(cnt == tickets.length) { // 모든 항공권을 사용했다면 result에 path 추가
            result.add(path); 
            return; 
        }

        for(int i = 0; i < tickets.length; i++) {
            if(!visited[i] && current.equals(tickets[i][0])) { // 아직 방문하지 않았고 현재 위치가 출발지인 항공권을 찾음
                visited[i] = true; // 사용함 표시
                dfs(tickets, cnt + 1, tickets[i][1], path + " " + tickets[i][1]); // 현재 위치를 목적지로 지정, path에 추가
                visited[i] = false; // 다른 경로에서 써야하니까 다시 열어줌
            }
        }
    }
}
