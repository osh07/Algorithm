package day10;

public class ex05 {
	/*두 정수 q, r과 문자열 code가 주어질 때,
	 * code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.*/

	class Solution {
	    public String solution(int q, int r, String code) {
	        StringBuilder answer = new StringBuilder();

	        for (int i = r; i < code.length(); i += q) {
	            answer.append(code.charAt(i));
	        }

	        return answer.toString();
	    }
	}
}
	/*  public static void main(String[] args) {
        // 테스트 케이스
        String result1 = solution(3, 1, "qjnwezgrpirldywt");
        String result2 = solution(1, 0, "programmers");

        // 결과 출력
        System.out.println(result1); // "jerry"
        System.out.println(result2); // "programmers"
    }
	 */
