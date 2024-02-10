import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        // 시작은 0으로 잡고
        int start = section[0];
        // 끝은 시작부터 롤러의 길이만큼(배열의 인덱스는 0부터 시작 고려)
        int end = section[0] + (m-1);
        // section이 1 이상이므로 최소 1번은 칠해야함
        int ans = 1;
            
        // 반복문을 돌며 section 범위에 있는 지 확인
        for(int i : section){
            // 범위에 없으면 넘어감
            if(i>=start && i<=end)
                continue;
            else{ // 범위에 있으면 시작 지점과 끝 지점을 다시 잡아주고 정답 카운트 증가
                start = i;
                end = i + (m-1);
                ans++;
            }
        }
        return ans;
    }
}