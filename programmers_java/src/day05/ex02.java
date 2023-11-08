package day05;

public class ex02 {

	//두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
	class Solution {
	    public int solution(int a, int d, boolean[] included) {
	        int answer = 0;
	        for (int i = 0; i < included.length; i++) {
	            if (included[i]) {
	                answer += a + i * d;
	            }
	        }
	        return answer;
	    }
	}
	//등차수열 첫째항'a',둘째항'a+d',셋째항'a+2d',넷째항'a+3d' 이런 식으로 계속 계산
	//첫째항 a에 i에 곱해진 공차 d를 더해서 i번째 항 구함
	//이 값을 included[i]가 'true'인지 확인하여 합산함
	//a+i*d는 i번째 항 의미. true인 포함 여부에 따라 answer에 더해 최종 합 구함
}
