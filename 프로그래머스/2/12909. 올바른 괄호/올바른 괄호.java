class Solution {
    public boolean solution(String s) {
        // 아직 닫히지 않은 '('의 개수
        int count = 0;

        // 문자열을 처음부터 끝까지 확인
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // 열린 괄호이면 개수 증가
            if (current == '(') {
                count++;
            } else {
                // 닫힌 괄호이면 개수 감소
                count--;
            }

            /*
             * count가 음수라는 것은
             * 짝이 되는 '('가 없는데 ')'가 나왔다는 뜻
             */
            if (count < 0) {
                return false;
            }
        }

        /*
         * 모든 문자를 확인한 후:
         * count == 0이면 모든 괄호가 닫힘
         * count > 0이면 닫히지 않은 '('가 남아 있음
         */
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}