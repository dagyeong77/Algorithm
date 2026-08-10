class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        // 모든 원소의 합을 저장한다.
        int sum = 0;

        // 모든 원소의 곱을 저장한다.
        // 곱셈이므로 초기값은 0이 아니라 1이어야 한다.
        int product = 1;

        // num_list의 모든 원소를 차례대로 확인한다.
        for (int i = 0; i < num_list.length; i++) {
            // 현재 원소를 합에 더한다.
            sum += num_list[i];

            // 현재 원소를 곱한다.
            product *= num_list[i];
        }

        // 모든 원소의 곱이 모든 원소의 합의 제곱보다 작은지 확인한다.
        if (product < sum * sum) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}