import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean solution(String s) {
        //최종 결과를 저장할 변수 
        boolean answer = false;
        
        //Deque를 스택처럼 사용 
        Deque<Character> stack = new ArrayDeque<>();
        //문자열 s를 처음부터 끝까지 한 글자씩 확인
        for(int i=0; i<s.length(); i++) {
            //현재 문자가 '('인 경우 
            if(s.charAt(i) == '(') {
                //'('를 스택에 저장 
                stack.add(s.charAt(i));
            } else {   //현재 문자가 ')'인 경우
                //')'가 나왔는데 스택이 비어있다면 
                //짝이 되는 '('가 없다는 뜻
                if(stack.isEmpty()) {
                    //answer는 처음에 false였으므로 바로 false 변환
                    return answer;
                }
                //')'와 짝이 되는 가장 최근의 '(' 하나 제거 
                stack.pollLast();
            }
        }
        //문자열을 끝까지 검사한 후 stack이 비어있다는 것은 모든 '('와 ')'가 짝을 이루었다는 뜻 
        if(stack.isEmpty()) {
            answer = true;
        }
        //stack에 '('가 남아있으면 false
        //stack이 비어있으면 true 
        return answer;
    }
}