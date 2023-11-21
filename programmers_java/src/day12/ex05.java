package day12;
import java.util.*;
public class ex05 {
	/*정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
단, arr에 2가 없는 경우 [-1]을 return 합니다.*/
	class Solution {
	    public ArrayList<Integer> solution(int[] arr) {
	        ArrayList<Integer> answer = new ArrayList<Integer>();
	        int start = -1;
	        int end = -1;
	        for(int i = 0; i<arr.length; i++){
	            if(arr[i]==2){
	                start = i;
	                break;
	            }
	        }
	        for(int i = arr.length-1; i>=0; i--){
	            if(arr[i]==2){
	                end = i;
	                break;
	            }
	        }
	        if(start==-1 && end==-1){
	            answer.add(-1);
	        } else{
	            for(int i = start; i<=end; i++){
	                answer.add(arr[i]);
	            }
	        }

	        return answer;
	    }
	}
}
