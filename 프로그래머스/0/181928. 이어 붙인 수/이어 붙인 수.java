class Solution {
    public int solution(int[] num_list) {
        // 홀수를 순서대로 이어 붙일 문자열
        String sum1 = "";

        // 짝수를 순서대로 이어 붙일 문자열
        String sum2 = "";

        // 배열의 모든 원소를 순서대로 확인
        for (int i = 0; i < num_list.length; i++) {

            // 현재 숫자가 홀수라면 sum1에 이어 붙임
            if (num_list[i] % 2 == 1) {
                sum1 += num_list[i];
            } else {
                // 현재 숫자가 짝수라면 sum2에 이어 붙임
                sum2 += num_list[i];
            }
        }

        // 이어 붙인 문자열을 실제 정수로 변환
        int sum1Number = Integer.parseInt(sum1);
        int sum2Number = Integer.parseInt(sum2);

        // 홀수를 이어 붙인 수와 짝수를 이어 붙인 수의 합
        return sum1Number + sum2Number;
    }
}