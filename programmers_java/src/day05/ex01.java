package day05;

public class ex01 {
	//문자열 code가 주어집니다. 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
	//mode는 0과 1이 있으며, idx를 0붜 code의 길이 -1까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
	//mode가 0일 때 code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다. code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
	//mode가 1일 때 code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다. code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
	
	public String solution(String code) {
	int mode = 0;
    StringBuilder ret = new StringBuilder();

    for (int i = 0; i < code.length(); i++) {
        if (mode == 0) {
            if (code.charAt(i) == '1') {
                mode = 1;
            } else if (i % 2 == 0) {
                ret.append(code.charAt(i));
            }
        } else {
            if (code.charAt(i) == '1') {
                mode = 0;
            } else if (i % 2 != 0) {
                ret.append(code.charAt(i));
            }
        }
    }

    if (ret.length() == 0) {
        return "EMPTY";
    }
    return ret.toString();
}
}