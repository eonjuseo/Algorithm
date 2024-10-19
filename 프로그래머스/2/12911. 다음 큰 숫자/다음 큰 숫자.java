class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = Integer.bitCount(n);
        int bCount = 0;
        
        while(true) {
            n++;
            bCount = Integer.bitCount(n);
            
            if(nCount == bCount) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}