class Solution {
    public int solution(int a, int b, int c, int d) {
        //크기가 7인 배열 생성 
        int[] count = new int[7];
        
        //각 주사위 숫자가 나올 때마다 해당 숫자의 count 값을 1 증가시킨다 
        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;
        
        int p = 0;
        int q = 0;
        int r = 0; 
        
        //경우 1. 네 주사위가 모두 같은 경우 
        for (int i=1; i<=6; i++) {
            if (count[i] == 4) {
                return 1111*i;
            }
        }    
        //경우 2. 세 주사위가 같고 하나만 다른 경우 
        for (int i=1; i<=6; i++) {
            //3번 나온 숫자를 찾으면 p에 저장
            if (count[i] == 3) {
                p = i;
            }
            //1번 나온 숫자를 찾으면 q에 저장 
            if (count[i] == 1) {
                q = i;
            }
        }
        //p가 0이 아니라는 것은 위 반복문에서 "3번 나온 숫자"를 찾았다는 뜻 
        if (p!=0) {
            return (10 * p + q)*(10 * p + q);
        }
        
        //경우 3. 두 개씩 같은 숫자가 있는지 확인
        //2번 나온 숫자 두 개를 first, second에 저장 
        int first = 0;
        int second = 0;
        
        for (int i=1; i<=6; i++) {
            //i라는 숫자가 정확히 2번 나왔다면 
            if (count[i] == 2) {
                //아직 첫 번째 숫자를 찾지 않았다면 
                if (first == 0) {
                    //첫 번째 숫자로 저장
                    first = i;
                } else {
                    //이미 first가 있다면 
                    //두 번째로 2번 나온 숫자라는 뜻 
                    second = i; 
                }
            }
        }
        //first와 second가 둘 다 존재한다면 
        //두 숫자가 각각 2번씩 나왔다는 뜻 
        if(first != 0 && second != 0) {
            return (first + second)*Math.abs(first - second);
        }
        //경우 4. 두 개만 같고 나머지 두 개가 다른 경우 
        int dup = 0;
        int single1 = 0;
        int single2 = 0;
        
        for (int i=1; i<=6; i++) {
            //2번 나온 숫자 
            if (count[i] == 2) {
                dup = i;
            }
            //1번 나온 숫자를 찾는다 
            if (count[i] == 1) {
                //아직 첫 번째 숫자를 못 찾았다면
                if (single1 == 0) {
                    single1 = i;
                } else {
                //이미 하나를 찾았다면 두 번째 숫자로 저장 
                single2 = i;
                }
            }
        }
        //dup가 존재한다면 어떤 숫자가 2번 나왔다는 뜻 
        if (dup != 0) {
                return single1*single2;
            }
        //경우 5. 네 숫자가 모두 다른 경우 
        for (int i=1; i<=6; i++) {
            //i를 1부터 6까지 증가시키면서 확인하기 때문에 처음 발견되는 숫자가 가장 작은 숫자임 
            if (count[i] == 1) {
                return i;
            }
        }
        return 0;
    }
}