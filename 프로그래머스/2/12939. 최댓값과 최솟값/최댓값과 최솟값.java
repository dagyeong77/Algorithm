class Solution {
    public String solution(String s) {
        
        String[] numbers = s.split(" ");
        
        int first = Integer.parseInt(numbers[0]);
        
        int min = first;
        int max = first; 
        
        for (int i=1; i<numbers.length; i++) {
            int current = Integer.parseInt(numbers[i]);
            
            if(current < min) {
                min = current;
            }
            
            if(current > max) {
                max = current; 
            }
        }
        return min + " " + max;
    }
}