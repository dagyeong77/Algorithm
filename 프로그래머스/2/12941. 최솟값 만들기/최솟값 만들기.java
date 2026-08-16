import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        // 곱한 값들의 합을 저장
        int answer = 0;

        // 두 배열을 오름차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            /*
             * A는 앞에서부터 선택: A[i]
             * B는 뒤에서부터 선택: B[B.length - 1 - i]
             *
             * 작은 값과 큰 값을 서로 짝지어 곱한다.
             */
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}