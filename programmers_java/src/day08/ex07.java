package day08;

public class ex07 {
	/* 문자열 여러 번 뒤집기 
	 * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
	 * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
	 * my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
	 */
	
	class Solution {
	    public String solution(String my_string, int[][] queries) {
	        if (my_string == null || my_string.isEmpty()) {
	            return my_string;
	        }

	        char[] arr = my_string.toCharArray();

	        for (int[] query : queries) {
	            int start = query[0];
	            int end = query[1];

	            start = Math.max(0, Math.min(start, my_string.length() - 1));
	            end = Math.max(0, Math.min(end, my_string.length() - 1));

	            while (start <= end) {
	                char temp = arr[start];
	                arr[start] = arr[end];
	                arr[end] = temp;

	                start++;
	                end--;
	            }
	        }

	        return new String(arr);
	    }
	}

}
