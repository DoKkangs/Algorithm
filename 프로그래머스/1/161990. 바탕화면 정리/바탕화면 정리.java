import java.lang.Math;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        // l : 드래그 왼쪽 끝 좌표, r : 드래그 오른쪽 끝 좌표
        // u : 드래그 위쪽 끝 좌표, d : 드래그 아래쪽 끝 좌표
        int left,right,up,down;
        
        // left = up = wallpaper의 최대 길이 - 1
        left = up = 49;
        // right = down = wallpaper의 최소 길이 - 1
        right = down = 0;
        
        for(int i = 0 ; i < wallpaper.length ; i++){
            for(int j = 0 ; j < wallpaper[i].length() ; j++){
            	// 파일이 존재한다면
                if(wallpaper[i].charAt(j)=='#'){
                    left = Math.min(left,j);
                    up = Math.min(up,i);
                    right = Math.max(right,j);
                    down = Math.max(down,i);
                }
            }
        }
        // 드래그 위쪽, 왼쪽, 아래쪽, 오른쪽 좌표를 차례로 담음. 아래쪽과 오른쪽 좌표는 1 증가
        answer[0] = up;
        answer[1] = left;
        answer[2] = down + 1;
        answer[3] = right + 1;
        return answer;
    }
}