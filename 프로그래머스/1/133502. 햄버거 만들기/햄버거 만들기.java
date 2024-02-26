import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        
        // 1.햄버거는 [1, 2, 3, 1]
        // 입력받은 값을 스택에 하나씩 저장
        // 만약 스택의 사이즈가 4이상이면, 햄버거를 만들 수 있는 지 하나씩 확인 ([1,2,3,1] 을 가지는지 확인)
        // 만약 햄버거를 만들 수 있다면 result를 증가시킨 후, 해당 스택에서 4개를 삭제
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
		for (int in : ingredient) {
			stack.push(in);
			if (stack.size() >= 4) {
				int size = stack.size();
				if(stack.get(size - 1) == 1
						&& stack.get(size - 2) == 3
						&& stack.get(size - 3) == 2
						&& stack.get(size - 4) == 1) {
					answer++;
					stack.pop();
					stack.pop();
					stack.pop();
					stack.pop();
				}
			}
		}
        
        return answer;
    }
}