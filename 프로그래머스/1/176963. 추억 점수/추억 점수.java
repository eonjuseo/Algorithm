import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new LinkedHashMap<>();
        
        for(int i=0; i< name.length; i++){
            map.put(name[i], yearning[i]); 
        }
        
        for(int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String people : photo[i])
                if(map.containsKey(people)) {
                    score += map.get(people);
                }
            answer[i] = score;        
        }        
        return answer;
    }
}
