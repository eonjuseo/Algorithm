class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int card1 = 0; 
        int card2 = 0;
        
        for (String current : goal) {
            if (card1 < cards1.length && current.equals(cards1[card1])) {
                card1++; 
            } else if (card2 < cards2.length && current.equals(cards2[card2])) {
                card2++; 
            } else {
                answer = "No"; 
            }
        }
            
        return answer;
    }
}