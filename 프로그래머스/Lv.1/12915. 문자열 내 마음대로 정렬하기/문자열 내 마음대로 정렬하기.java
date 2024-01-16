import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        // 주어진 배열을 순회하면서 n번째 index를 더해서 리스트에 더해줌.
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        // 정렬
        Collections.sort(list);
        // 리스트의 크기만큼 돌면서 앞에 붙여줬던 인덱스를 빼줌
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}