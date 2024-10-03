import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num = nums.length / 2;
        Set<Integer> hs = new HashSet<Integer>();
        for (int i=0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        int pokemon_nums = hs.size();
        if (pokemon_nums <= num) {
            answer = pokemon_nums;
        } 
        else {
            answer = num;
        }
        
        return answer;
    }
}