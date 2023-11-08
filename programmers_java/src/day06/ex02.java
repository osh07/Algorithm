package day06;

public class ex02 {
	//정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

	class Solution {
	    public int solution(int n, String control) {
	        for (int i = 0; i < control.length(); i++) {
	            char ch = control.charAt(i);
	            switch(ch) {
	                case 'w': n += 1; break;
	                case 's': n -= 1; break;
	                case 'd': n += 10; break;
	                case 'a': n -= 10; break;
	            }
	        }
	        return n;
	    }
	}
	//for(char ch:control.toCharArray()){switch~
}
