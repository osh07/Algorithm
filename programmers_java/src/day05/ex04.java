package day05;

public class ex04 {
	/*정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.*/
	class Solution {
	    public int solution(int[] num_list) {
	        int answer = 0;

	        int temp = 1;
	        int temp1 = 0;
	        for(int i=0; i<num_list.length; i++){
	            temp *= num_list[i];
	            temp1 += num_list[i];
	        }

	        answer = temp1*temp1 > temp ? 1 : 0;
	        return answer;
	    }
	}

}
