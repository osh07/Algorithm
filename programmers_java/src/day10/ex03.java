package day10;

public class ex03 {
	/* 문자열 뒤집기
	 * 문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
	 * my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.*/
	
	class Solution {
	    /*
	    public static void main(String[] args) {
	        // 테스트 케이스
	        String result1 = solution("Progra21Sremm3", 6, 12);
	        String result2 = solution("Stanley1yelnatS", 4, 10);

	        // 결과 출력
	        System.out.println(result1); // "ProgrammerS123"
	        System.out.println(result2); // "Stanley1yelnatS"
	    }
	    */
	    public String solution(String my_string, int s, int e) {
	        StringBuilder reversed = new StringBuilder(my_string.substring(s, e + 1)).reverse();
	        String answer = my_string.substring(0, s) + reversed + my_string.substring(e + 1);
	        return answer;
	    }
	}
}
