import java.util.*;
class Solution {
    static int[][] arr;
        public int solution(int n, int[][] wires) {
        int answer = n;
        arr = new int [n + 1][n + 1];
        
        // 인접행렬에 input
        for(int i = 0; i < wires.length; i++) {
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        // 선을 끊어보며 순회
        for(int i = 0; i < wires.length; i++) {
            int a = wires[i][0];     
            
            arr[wires[i][0]][wires[i][1]] = 0;
            arr[wires[i][1]][wires[i][0]] = 0;
            
            answer = Math.min(answer, bfs(n, a));
            
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        return answer;
    }
    
    public int bfs(int n, int a) { // 노드 수 구하기
        int[] visited = new int[n + 1];
        int count = 1;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(a);
        
        while(!queue.isEmpty()) {
            int point = queue.poll();    
            visited[point] = 1;
            
            for (int i = 1; i <= n; i++) {
                if(visited[i] == 1) {
                    continue;
                }
                
                if(arr[point][i] == 1) {
                    queue.offer(i);
                    count ++;
                }
            }
        }
        
        return (int)Math.abs(n - 2 * count);
    }
}