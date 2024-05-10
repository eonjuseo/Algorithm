// 이진 탐색 
// 징검다리를 건널 수 있는 친구들의 수
// 1. 탐색하는 친구의 수가 건널 수 있음 - 중간값보다 작은 값들로 건널 수 있음 - 중간값보다 큰 인원으로 건널 수 있는지 확인
// 2. 탐색하는 친구의 수가 건널 수 없음 - 중간값보다 큰 값으로는 건널 수 없음 - 중간값보다 적은 인원으로 건널 수 있는지 확인

class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int min = 0;
        int max = 200000000;
        
        while (min <= max) {
            int mid = (min + max) / 2;        
            if(binarySearch(stones, k, mid)) {
                min = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                max = mid - 1;
            }
        }
        return answer;
    }
    
    Boolean binarySearch(int[] stones, int k, int mid) {
        int skip = 0;
        
        for (int stone : stones) {
            if(stone - mid < 0)
                skip++;
            else
                skip = 0;
            if(skip == k) 
                return false;
        }   
        return true;
    }
}