package day12;

public class ex04 {

	class Solution {
	    public int[] solution(int[] arr, int[][] intervals) {
	        int start1 = intervals[0][0];
	        int end1 = intervals[0][1];
	        
	        int start2 = intervals[1][0];
	        int end2 = intervals[1][1];
	        
	        int[] result = new int[end1 - start1 + 1 + end2 - start2 + 1];
	        
	        int index = 0;
	        
	        for (int i = start1; i <= end1; i++) {
	            result[index++] = arr[i];
	        }
	        for (int i = start2; i <= end2; i++) {
	            result[index++] = arr[i];
	        }
	        
	        return result;
	    }
	}

}
