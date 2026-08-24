class Solution {
    public int solution(String number) {
        int answer = 0;
        
        //문자열을 문자배열로 변환 
        char[] arr = number.toCharArray();
        
        //문자 배열을 처음부터 끝까지 확인 
        for(int i=0; i<number.length(); i++) {
            //arr[i]는 문자이므로 '0'을 빼서 실제 숫자로 변환 
            //변환한 숫자를 answer에 계속 더함 
            answer += arr[i] - '0';
        }
        //모든 자리 숫자를 더한 뒤 9로 나눈 나머지를 반환 
        return answer % 9;
    }
}