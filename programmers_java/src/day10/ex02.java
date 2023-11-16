package day10;

public class ex02 {

	/*어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
	 * 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
	문자열 my_string과 is_prefix가 주어질 때,
	is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.*/
	class Solution {
	    /*
	    public static void main(String[] args) {
	        // 테스트 케이스
	        int result1 = solution("banana", "ban");
	        int result2 = solution("banana", "nan");
	        int result3 = solution("banana", "abcd");
	        int result4 = solution("banana", "bananan");

	        // 결과 출력
	        System.out.println(result1); // 1
	        System.out.println(result2); // 0
	        System.out.println(result3); // 0
	        System.out.println(result4); // 0
	    }
	    */
	    public int solution(String my_string, String is_prefix) {
	        int answer = 0;
	        answer = my_string.startsWith(is_prefix) ? 1 : 0;
	        return answer;
	    }
	}
}
