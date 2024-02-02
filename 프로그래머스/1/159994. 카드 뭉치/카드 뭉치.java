class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Idx = 0; // cards1 배열의 인덱스
        int cards2Idx = 0; // cards2 배열의 인덱스
        
        // goal 배열을 순회
        for (String str : goal) {
            // currentStr이 cards1[idx1] 또는 cards2[idx2]에 포함하는지 확인
            if (cards1Idx < cards1.length && str.equals(cards1[cards1Idx])) {
                cards1Idx++; // cards1[idx1]에 포함하는 경우 card1Idx 증가
            } else if (cards2Idx < cards2.length && str.equals(cards2[cards2Idx])) {
                cards2Idx++; // cards2[idx2]에 포함하는 경우 card2Idx2 증가
            } else {
                return "No"; // 둘 다 포함하지 않는 경우
            }
        }
        return "Yes";
    }
}