package day07;
import java.util.*;

public class ex02 {
/* 2. 배열 만들기2
 * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.*/
		class Solution {
	    public int[] solution(int l, int r) {
	        List<Integer> list = new ArrayList<>();
	        for(int i = l; i<=r; i++) {
	            String str = i + "";
	            int count = 0;
	            for(int j = 0; j < str.length(); j++) {
	                if(str.charAt(j) == 48 || str.charAt(j) == 53) {
	                    count ++;
	                }
	            }
	            if(count == str.length()) {
	                list.add(i);
	            }
	        }
	        int[] answer = list.stream().mapToInt(i->i).toArray();
	        int[] empty = {-1};
	        if(answer.length == 0) return empty;
	        return answer;
	    }
	}
}