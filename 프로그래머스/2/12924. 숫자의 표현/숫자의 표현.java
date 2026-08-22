class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            
            for(int current = i; current <= n; current++) {
                sum+= current;
                
                if(sum == n) {
                    answer++;
                    break;
                }
                if(sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}