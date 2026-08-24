class Solution {
    public int solution(int[] arr) {
        //answer에는 지금까지 확인한 수들의 최소공배수를 저장 
        //처음에는 아직 arr[0] 하나밖에 확인하지 않았으므로 arr[0] 자체를 현재 최소공배수라고 생각 
        int answer = arr[0];
        
        //arr[0]은 이미 answer에 넣었으므로 두 번째 원소인 arr[1]부터 확인 
        for(int i=1; i<arr.length; i++) {
            //현재까지의 최소공배수 answer와 새로 확인하는 숫자 arr[i]의 최소공배수를 구한다 
            //이전 결과와 다음 숫자를 계속 비교해서 최소공배수를 누적해 나간다 
            answer = lcm(answer, arr[i]);
        }
        //배열의 모든 숫자를 확인한 뒤 answer에는 전체 숫자들의 최소공배수가 들어있음 
        return answer;
    }
    
    //두 수 a, b의 최소공배수를 구하는 메서드 
    //최소공배수 공식: (a * b) / 최대공약수 
    static int lcm(int a, int b) {
        return a*b/gcd(a, b);
    }
    //두 수 a, b의 최대공약수를 구하는 메서드 
    //유클리드 호제법 사용 
    //큰 수와 작은 수의 최대공약수는 "작은 수"와 "두 수를 나눈 나머지"의 최대공약수와 같다 
    static int gcd(int a, int b) {
        //b가 0이 될 때까지 반복 
        while (b != 0) {
            //a를 b로 나눈 나머지를 임시로 저장 
            int temp = a % b;
            //기존 b를 새로운 a로 옮긴다 
            a = b;
            //방금 구한 나머지를 새로운 b로 넣는다 
            b = temp;
        }
        //b가 0이 되었을 때 a에 남아있는 값이 최대공약수 
        return a;
    }
}