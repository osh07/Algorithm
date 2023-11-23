package day13;

public class ex02 {
	/*n번째 원소부터
	 * 정수 리스트 num_list 와 정수 n이 주어질 때,n번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.*/
	class Solution{
		public int[] solution(int[]num_list, int n) {
			int[] answer = new int[num_list.length-n+1];
			for(int i=0;i<num_list.length-n+1;i++) {
				answer[i]=num_list[i+n-1];
			}
			return answer;
		}
	}

}
