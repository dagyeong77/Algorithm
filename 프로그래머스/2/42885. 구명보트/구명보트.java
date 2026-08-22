import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        //몸무게를 오름차순으로 정렬 
        Arrays.sort(people);
        
        //가장 가벼운 사람
        int left = 0;
        //가장 무거운 사람
        int right = people.length-1;
        
        //구조하지 않은 사람이 남아있는 동안 반복 
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            //가장 무거운 사람은 현재 보트로 항상 구조
            right--;
            //보트 한 대 사용 
            answer++;
        }
        
        return answer;
    }
}