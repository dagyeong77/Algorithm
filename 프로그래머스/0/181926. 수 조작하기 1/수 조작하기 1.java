class Solution {
    public int solution(int n, String control) {
        int answer = n;
                
        for (int i=0; i<control.length(); i++) {
            char current = control.charAt(i);
            
            if(current == 'w') {
                answer += 1;
            } else if (current == 's') {
                answer -= 1;
            } else if (current == 'd') {
                answer += 10;
            } else if (current == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}