package day07;
import java.util.*;
public class ex05 {
/* 수열과 구간 쿼리 2
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
 */
	class Solution {
	    public int[] solution(int[] arr) {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        int i = 0;
	        while (i < arr.length) {
	            if (arrayList.isEmpty()) {
	                arrayList.add(arr[i]);
	                i += 1;
	            } else if (arrayList.get(arrayList.size() - 1) < arr[i]) {
	                arrayList.add(arr[i]);
	                i += 1;
	            } else if (arrayList.get(arrayList.size() - 1) >= arr[i]) {
	                arrayList.remove(arrayList.size() - 1);
	            }
	        }
	        int idx = 0;
	        int[] stk = new int[arrayList.size()];
	        for (int data : arrayList)
	            stk[idx++] = data;
	        return stk;
	    }
	}
}
