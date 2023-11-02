package programmers_java;

import java.util.Scanner;

public class day01 {
	/* 1. 문자열 출력하기 (문자열 str이 주어질 때, str을 출력하는 코드를 작성해보세요.) */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		System.out.println(answer);
		
	
	/* 2. 문자열 반복해서 출력하기 (str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해보세요.) */
		
	String str = scanner.next();
	int n = scanner.nextInt();
		for(int i=0;i<n;i++){
			System.out.print(str);
		}
	
		
	/* 3. 대소문자 바꿔서 출력하기 */
	String a = scanner.next();
	String alphabet = "";
	
	for (Character c : a.toCharArray()) {
	    if (Character.isUpperCase(c)) {
	        alphabet += Character.toLowerCase(c);
	    } else if (Character.isLowerCase(c)) {
	        alphabet += Character.toUpperCase(c);
	    }
	}
	
	System.out.println(alphabet);

	/* 4. 특수문자 출력하기 ( !@#$%^&*(\\\'\"<>?:; ) */
	//1
	String Symbol = "!@#$%^&*(\\\'\"<>?:;";
    System.out.println(Symbol);
    //2
    int[] textSymbol = {33, 64, 35, 36, 37, 94, 38, 42,  40, 92, 39, 34, 60, 62, 63, 58, 59};

    for (int i=0;i<textSymbol.length;i++) {
        int charCode=textSymbol[i];
        System.out.print((char) charCode);
    }
}

}
