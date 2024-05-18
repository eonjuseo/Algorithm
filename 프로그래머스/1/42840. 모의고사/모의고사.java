import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] sol1 = {1, 2, 3, 4, 5};
        int[] sol2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] sol3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int ans1 = 0, ans2 = 0, ans3 = 0;

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == sol1[i % sol1.length]) 
                ans1++;           
            if(answers[i] == sol2[i % sol2.length]) 
                ans2++; 
            if(answers[i] == sol3[i % sol3.length]) 
                ans3++; 
        }
        
        int max = Math.max(Math.max(ans1, ans2), ans3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max == ans1) list.add(1); 
        if(max == ans2) list.add(2); 
        if(max == ans3) list.add(3); 
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}