class Solution {
	boolean solution(String s) {
        boolean answer = false;
		String[] arr = s.toLowerCase().split(""); 
		int pCnt = 0;
        int yCnt = 0;
        
		for (int i = 0; i < arr.length; i++) { 
			if ("p".equals(arr[i])) { 
				pCnt++;
			} else if ("y".equals(arr[i])) {
				yCnt++;
			}
		}
		if (pCnt == yCnt) {
            answer = true;
		}
		return answer;
	}
}