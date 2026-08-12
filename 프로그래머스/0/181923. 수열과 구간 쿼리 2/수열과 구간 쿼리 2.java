class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //쿼리 하나마다 결과가 하나씩 나옴
        int[] answer = new int[queries.length];
        
        //queries에 들어있는 쿼리를 처음부터 하나씩 처리한다 
        for (int q=0; q<queries.length; q++) {
            int s = queries[q][0];   //탐색을 시작할 arr의 인덱스
            int e = queries[q][1];   //탐색을 끝낼 arr의 인덱스
            int k = queries[q][2];   //찾아야 하는 값의 기준
            
            //현재 쿼리에서 찾은 가장 작은 값을 저장 
            int min = -1;
            
            //arr의 s번 인덱스부터 e번 인덱스까지 확인
            for (int i=s; i<=e; i++) {
                //현재 값 arr[i]가 k보다 큰지 확인 
                if (arr[i] >k) {
                    //둘 중 하나를 만족하면 min을 현재 값으로 변경
                    if (min == -1 || arr[i] < min) {
                        min = arr[i];
                    }
                }
            }
            //현재 쿼리의 결과를 정답 배열에 저장 
            answer[q] = min;
        }
        return answer;
    }
}