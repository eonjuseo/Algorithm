class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        
        temp = my_string.replaceAll("[a-zA-Z]","");
        
        for(int i = 0; i < temp.length(); i++){
            answer += temp.charAt(i) - '0';
        }
        
        
        return answer;
    }
}