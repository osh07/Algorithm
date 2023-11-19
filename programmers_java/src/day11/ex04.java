package day11;

public class ex04 {
	/*정수 start_num와 end_num가 주어질 때,
	 * start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.*/
	
	class Solution {
	    public int[] solution(int start, int end_num) {
	        int size = start - end_num + 1;
	        int[] answer = new int[size];
	        
	        for (int i = 0; i < size; i++) {
	            answer[i] = start--;
	        }
	        
	        return answer;
	    }
	}

}
