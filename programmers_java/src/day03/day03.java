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
	
	/* 4. 더 크게 합치기 */
	class Solution4 {
	    public int solution(int a, int b) {
	        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
	        int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
	        return ab >= ba ? ab : ba;
	    }
	}
	
	/* 5. 두 수의 연산값 비교하기 */
	class Solution5 {
	    public int solution(int a, int b) {
	        int answer = 0;
	        String ab = Integer.toString(a) + Integer.toString(b);

	        if(Integer.parseInt(ab) >= (2 * a * b)){
	            answer = Integer.parseInt(ab);
	        }
	        else answer = 2 * a * b;

	        return answer;
	    }
	}

	

}
