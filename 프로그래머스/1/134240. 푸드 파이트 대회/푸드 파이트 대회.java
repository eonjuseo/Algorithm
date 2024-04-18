import java.util.*;

class Solution {
    public String solution(int[] food) {
        Stack<String> stack = new Stack();
        String answer = "";
        for(int i = 0; i < food.length; i++) {
            int eat = food[i] / 2;
            
            for(int j = 0; j < eat; j++) {
                if(eat > 0) {
                    stack.push(Integer.toString(i));
                    answer += i;
                }
            }
        }
        answer += '0';
        
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        
        return answer;
        }
}