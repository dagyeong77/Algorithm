class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        //a와 b를 문자열로 변환하면서 순서대로 연결
        String ab = "" + a + b;
        //b와 a를 문자열로 변환하면서 순서대로 연결
        String ba = "" + b + a;
        
        //연결된 문자열을 다시 정수로 변환
        int num1 = Integer.parseInt(ab);
        int num2 = Integer.parseInt(ba);
        
        //두 정수 중 더 큰 값을 answer에 저장 
        answer = Math.max(num1, num2);
        
        return answer;
    }
}