class Solution {
    public String solution(int[] food) {
       // StringBuilder 선언
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            // 음식을 2로 나눈 값을 카운트 변수에 저장 후 카운트만큼 builder에 추가
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }
        
        // 추가된 음식에 0(물)과 reverse된 문자열 추가
        String answer = sb + "0";
        answer += sb.reverse();
        
        return answer;
    }
}