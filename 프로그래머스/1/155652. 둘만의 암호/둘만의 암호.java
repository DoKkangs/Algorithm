import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        //반복문을 돌며 한글자씩 확인
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            int count = 1;
            // 알파벳 각각이 index만큼 건너뛰었는지 체크
            while(count <= index){
                ++c;
                // 범위를 벗어나면 26을 빼줌
                if(c > 'z')
                    c -= 26;
                // skip에 해당하면 건너뛰기
                if(skip.contains(c + ""))
                    continue;
                else // skip에 해당하지 않으면 카운트 증가
                    count++;
            }
            answer += c;
        }
        return answer;
    }
}