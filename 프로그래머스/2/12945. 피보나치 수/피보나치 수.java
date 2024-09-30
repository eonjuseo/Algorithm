class Solution {
    int[] data = new int[100001];
    public int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        if(data[n] != 0) {
            return data[n] % 1234567;
        }
        
        return data[n] = (fibonacci(n - 2) + fibonacci(n - 1)) % 1234567;
    }
    
    public int solution(int n) {
        int answer = fibonacci(n);
        
        return answer;
    }
}