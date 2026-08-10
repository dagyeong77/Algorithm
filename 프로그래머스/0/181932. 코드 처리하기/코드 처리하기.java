class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        // code의 모든 문자를 처음부터 확인
        for (int i = 0; i < code.length(); i++) {
            // 현재 인덱스에 있는 문자
            char current = code.charAt(i);

            // 현재 문자가 '1'이면 mode를 반대로 변경
            if (current == '1') {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            } else {
                // mode가 0이면 짝수 인덱스의 문자만 추가
                if (mode == 0) {
                    if (i % 2 == 0) {
                        answer += current;
                    }
                } else {
                    // mode가 1이면 홀수 인덱스의 문자만 추가
                    if (i % 2 == 1) {
                        answer += current;
                    }
                }
            }
        }

        // 모든 문자를 처리한 후 결과가 비어 있는지 확인
        if (answer.equals("")) {
            return "EMPTY";
        }

        return answer;
    }
}