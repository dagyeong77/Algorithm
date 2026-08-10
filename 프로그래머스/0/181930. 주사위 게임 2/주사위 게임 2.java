class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int sum1 = a + b + c;
        int sum2 = a * a + b * b + c * c;
        int sum3 = a * a * a + b * b * b + c * c * c;
        
        if(a == b && b == c) {
            answer = sum1 * sum2 * sum3;
        }else if(a == b || b == c || a == c) {
            answer = sum1 * sum2;
        } else {
            answer = sum1;
        }
        return answer;
    }
}