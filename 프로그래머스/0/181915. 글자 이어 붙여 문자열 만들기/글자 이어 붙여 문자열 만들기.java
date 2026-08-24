class Solution {
    public String solution(String my_string, int[] index_list) {
        //최종적으로 만들어질 문자열 
        String answer = "";
        
        //index_list를 처음부터 끝까지 확인 
        for (int i=0; i<index_list.length; i++) {
            //index_list[i]에 들어있는 숫자를 이용해서 my_string의 해당 위치 문자를 가져온다 
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
}