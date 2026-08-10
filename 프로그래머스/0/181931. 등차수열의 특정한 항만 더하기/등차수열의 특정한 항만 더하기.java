class Solution {
    public int solution(int a, int d, boolean[] included) {
        // included가 true인 항들의 합을 저장
        int answer = 0;

        // included 배열의 모든 원소를 순서대로 확인
        for (int i = 0; i < included.length; i++) {

            // included[i]가 true인 경우에만 현재 항을 더함
            if (included[i]) {
                /*
                 * 배열의 인덱스는 0부터 시작하므로
                 * i번째 인덱스에 해당하는 등차수열의 항은
                 * a + (i * d)이다.
                 */
                answer += a + (i * d);
            }
        }

        // true인 항들만 더한 결과 반환
        return answer;
    }
}