package day06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex05 {


	class Solution {
	    public int[] solution(int[] arr, int[][] queries) {
	        List<Integer> result = new ArrayList<>();

	        for (int[] query : queries) {
	            int s = query[0];
	            int e = query[1];
	            int k = query[2];
	            int minValue = Integer.MAX_VALUE;

	            for (int i = s; i <= e; i++) {
	                if (arr[i] > k && arr[i] < minValue) {
	                    minValue = arr[i];
	                }
	            }

	            if (minValue == Integer.MAX_VALUE) {
	                result.add(-1);
	            } else {
	                result.add(minValue);
	            }
	        }
	 
	        int[] answer = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            answer[i] = result.get(i);
	        }

	        return answer;
	    }
	}
}
