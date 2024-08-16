import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                
                char current = keymap[i].charAt(j);
                if(map.containsKey(current)){
                    int idx = map.get(current);
                    map.put(current, Math.min(idx, j + 1));
                }
                else {
                    map.put(current, j + 1);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            
            for(char current : target.toCharArray()){
                if(map.containsKey(current)) {
                    count += map.get(current);
                }
                else {
                    count = -1;
                    break;
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}