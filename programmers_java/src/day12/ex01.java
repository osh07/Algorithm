package day12;

public class ex01 {
	/* 글자 지우기
	 * 문자열 my_string과 정수 배열 indices가 주어질 때,
	 * my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을
	 * return 하는 solution 함수를 작성해 주세요.*/
	class Solution {
	    public String solution(String my_string, int[] indices) {
	        char[] arr = my_string.toCharArray();
	        for(int i : indices) {
	            arr[i] = ' ';
	        }
	        StringBuilder sb=  new StringBuilder();
	        for(int i=0; i<arr.length; i++) {
	            if(arr[i] != ' ') {
	                sb.append(arr[i]);
	            }
	        }
	        return sb.toString();
	    }
	}
}
