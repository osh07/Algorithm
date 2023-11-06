package day04;

public class ex04 {
	/*문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
	두 수가 n과 m이라면
	">", "=" : n >= m
	"<", "=" : n <= m
	">", "!" : n > m
	"<", "!" : n < m
	두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
	*/
	class Solution {
	    public int solution(String ineq, String eq, int n, int m) {
	        boolean result = false;

	        if (ineq.equals(">") && eq.equals("=")) {
	            result = (n >= m);
	        } else if (ineq.equals("<") && eq.equals("=")) {
	            result = (n <= m);
	        } else if (ineq.equals(">") && eq.equals("!")) {
	            result = (n > m);
	        } else if (ineq.equals("<") && eq.equals("!")) {
	            result = (n < m);
	        }

	        return result ? 1 : 0;
	    }
	}

	
}
