package day03;

public class day03 {
	
	/* 1. 문자열 섞기 */
	public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i=0; i<str1.length(); i++){
            answer += str1.substring(i, i+1);
            answer += str2.substring(i, i+1);
        }
        return answer;
    }

	/* 2. 문자 리스트를 문자열로 변환하 */
	class Solution2 {
	    public String solution(String[] arr) {
	        String answer = "";
	        for(int i=0;i<arr.length;i++){
	            answer=answer+arr[i];
	        }
	        return answer;
	    }
	}
	
	/* 3. 문자열 곱하기 */
	class Solution3 {
	    public String solution(String my_string, int k) {
	        String answer = "";
	        for(int i=0;i<k;i++){
	            answer=answer+my_string;
	        }
	        return answer;
	    }
	}
}
