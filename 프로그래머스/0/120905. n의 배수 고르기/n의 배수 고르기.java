import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> array = new ArrayList<>();
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                array.add(numlist[i]);
            }
        }
        
        int[] answer = new int[array.size()];
        for(int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}