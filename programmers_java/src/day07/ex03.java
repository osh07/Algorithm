package day07;

public class ex03 {
/* 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요. */
	class Solution {
	    public int[] solution(int start, int end) {
	        int[] answer = new int[end-start+1];
	        for (int i=start; i<=end; i++) {
	            answer[i-start] = i;
	        }
	        return answer;
	    }
	}
}
