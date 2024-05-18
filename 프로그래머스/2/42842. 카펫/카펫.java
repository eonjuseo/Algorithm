class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = yellow + brown;
        
        for(int i = 3; i <= area; i++) {
            int height = i;
            int width = area / i;
            
            if(yellow == (width - 2) * (height - 2)) {
                answer[0] = width;
                answer[1] = height;
                break;    
            }
        }
        
        return answer;
    }
}