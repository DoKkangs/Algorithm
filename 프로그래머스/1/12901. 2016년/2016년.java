class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 요일을 담은 배열
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        // 각 달의 일수를 담은 배열
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // 총 일수
        int allDate = 0;
        // a달 이전까지 모든 일 수 더하기
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        // 나머지 일 수 더하기
        allDate += (b - 1);
        // 모듈러 연산으로 무슨 요일인지 계산
        answer = day[allDate % 7];
        return answer;
    }
}