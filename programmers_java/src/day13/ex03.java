package day13;

public class ex03 {
	/*정수 리스트 num_list와 정수 n이 주어질 때,
	 * num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.*/
	class Solution {
	    public int[] solution(int[] num_list, int n) {
	        int[] answer = new int[num_list.length];
	        int index = 0;

	        for (int i = n; i < num_list.length; i++) {
	            answer[index++] = num_list[i];
	        }

	        for (int i = 0; i < n; i++) {
	            answer[index++] = num_list[i];
	        }

	        return answer;
	    }
	}
}
