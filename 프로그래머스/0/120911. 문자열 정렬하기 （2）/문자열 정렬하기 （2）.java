import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase(); 
        
        char[] chr = my_string.toCharArray();
        Arrays.sort(chr);
        
        String answer = new String(chr);
        return answer;
    }
}
