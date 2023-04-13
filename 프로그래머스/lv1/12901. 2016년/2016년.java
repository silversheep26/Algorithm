class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day ={"FRI","SAT","SUN","MON","TUE","WED","THU"};  // 기준인 1월 1일이 금요일이라서
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daySum = 0;

        // 2016년 mm월 dd 일은 2016 년에서 몇번째 날일까?

        for (int i = 0; i < a - 1; i++) {  // 자신이 속한 달 이하 즉, 각 월의 일수 더 하기
            daySum += month[i];
        }
        daySum += (b-1);  // 1일부터 날짜의 수 + 1월1일 당일은 0
        int date = daySum%7;  // 일주일 단위로 만들기
        answer = day[date]; 
        
        return answer;
    }
}
