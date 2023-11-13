package day08;

public class ex06 {

	/* 9로 나눈 나머지
	 * 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
	이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
	 */
	
	class Solution {
	    public int solution(String number) {
	    	// 문자열 number의 각 자리 숫자를 더할 변수
	        int answer = 0;
	        // 문자열 number의 각 자리 숫자를 더함
	        for (char digit : number.toCharArray()) {
	            answer += digit - '0'; // char를 int로 변환
	        }
	        // 더한 숫자를 9로 나눈 나머지 반환
	        return answer % 9;
	    }
	}
}
