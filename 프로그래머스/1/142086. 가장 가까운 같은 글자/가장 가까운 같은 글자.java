class Solution {
    public int[] solution(String s) {
        // 풀이 접근 : -1로 지정해두고 해당 문자가 다시 등장하면 index를 뺀 차이값으로 저장
        
        // 문자열 s의 길이만큼 배열 크기 지정
        int[] answer = new int[s.length()];
        // 배열의 첫번째 값은 항상 처음 등장으로 -1
        answer[0] = -1;
        for(int i = 1 ; i < s.length() ; i++){
            // 일단 -1로 지정
            answer[i] = -1;
            // 반복문을 돌며 나왔던 문자라면 index 차이만큼이 답
            for(int j = 0 ; j < i ; j++){
                if(s.charAt(i) == (s.charAt(j))){
                    answer[i] = i - j;
                }
            }
        }
        return answer;
    }
}