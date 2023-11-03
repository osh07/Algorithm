package programmers_java;
import java.util.Scanner;
public class day02 {
	
	public static void main(String[] args) {
	
	/* 1. 덧셈식 출력하기 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		
		System.out.println(a+" + "+b+" = "+c);
		
		
	/* 2. 문자열 붙여서 출력하기
	 * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
	 * 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.*/
		String d = sc.next();
        String e = sc.next();
        System.out.println(d+e);
	
    /* 3. 문자열 돌리기 
     * 문자열 str이 주어집니다. 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.*/
		String f = sc.next();
		String[] g = f.split("");
		for(int i=0; i<g.length;i++){
		    System.out.println(g[i]);
		}

	/* 4. 홀짝 구분하기
	 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요. */
		int n=sc.nextInt();
		System.out.println(n+" is "+(n%2==0?"even":"odd"));
        
	}
	
	/* 5. 문자열 겹쳐쓰기 
	 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.*/
	public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer=my_string.substring(0,s);
        answer+=overwrite_string;
        answer+=my_string.substring(s+overwrite_string.length(),my_string.length());
        return answer;
    }
}
