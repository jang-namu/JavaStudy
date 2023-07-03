package programmers.lv2;
import java.util.*;
public class 광물_캐기 {
}
/*
    곡괭이 종류별로 0~5개, 곡괭이는 5개 캐면 부서짐
    선택한 곡괭이는 부서질때까지 사용
    최소 피로도
    광물을 5개씩 짝지어서 피로도의 합 순대로?
    다이아 = 철 5개 = 돌 25개
*/
class Solution {
    public int solution(int[] picks, String[] minerals) {
        //우선 미네랄을 picks * 5 개 까지만 끊는다.
        int num_axes = Arrays.stream(picks).sum();
        if (num_axes * 5 <= minerals.length) {
            minerals = Arrays.copyOfRange(minerals, 0, num_axes * 5);
        }

        int answer = 0;
        int[][] fatigue = new int[Math.min(num_axes, minerals.length/5+1)][];

        for (int i=0; i < fatigue.length; i++) {
            fatigue[i] = new int[6];
            fatigue[i][0] = 0;
        }

        int idx = 1;
        for (int i=0; i < minerals.length; i++) {
            if (minerals[i].equals("diamond")) {
                fatigue[i / 5][0] += 25;
                fatigue[i / 5][idx++] = 25;
            } else if (minerals[i].equals("iron")) {
                fatigue[i / 5][0] += 5;
                fatigue[i / 5][idx++] = 5;
            } else {
                fatigue[i / 5][0] += 1;
                fatigue[i / 5][idx++] = 1;
            }

            if (idx == 6) idx = 1;
        }

        Arrays.sort(fatigue, (o1, o2) -> {return o2[0] - o1[0];});
        for (int[] job : fatigue) {
            /*
            for (int x : job) {
                System.out.print(x + " ");
            }
            System.out.println();
            */
            int pick = -1;
            if (picks[0] > 0) {
                pick = 25;
                picks[0]--;
            } else if (picks[1] > 0) {
                pick = 5;
                picks[1]--;
            } else if (picks[2] > 0) {
                pick = 1;
                picks[2]--;
            } else {
                break;
            }

            for (int i=1; i < job.length; i ++) {
                if (job[i] == 0) {
                    break;
                }
                else if (job[i] / pick == 0) {
                    answer++;
                } else {
                    answer += job[i] / pick;
                }
                // System.out.println(job[i] + " " + pick + " " + answer);
            }
        }

        return answer;
    }
}