class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] arr = {"a", "e", "i", "o", "u"};
        
        for(String a : arr){
            answer = answer.replaceAll(a, "");
        }
        return answer;
    }
}