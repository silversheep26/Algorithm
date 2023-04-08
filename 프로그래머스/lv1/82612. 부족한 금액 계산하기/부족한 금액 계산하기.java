class Solution {
    public long solution(int price, int money, int count) {
        // count 번째 이용요금의 총합
        // total = price * 1 + price * 2 + price * 3 + ... + price * count;
        // total(사용할 돈) 과 money 의 차이
        // if (돈이 부족하지 않으면 = answer < 0) 0 으로 출력
        // 아니면 사용할 돈에서 내가 가지고 있는 돈의 차이가  answer = 필요한 돈
        
        long total = 0;
        for (int i = 1; i < count+1; i++) {
            total += (long) price * i;
        }

        long answer = total - money;

        if (answer < 0 ){
            answer = 0;
        }

        return answer;
    }
}