package section2string;

import java.util.Scanner;

/*
* 문제
* 설명
* 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
* 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

* 입력
* 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
* 문자열은 영어 알파벳으로만 구성되어 있습니다.

 * 출력
* 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
*
* 예시 입력 1
* StuDY

* 예시 출력 1
 * sTUdy
* */
public class Main {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		solution(kb.nextLine());
	}

	private static void solution(String input) {
		char[] upperCase1 = input.toCharArray();

		StringBuilder sb = new StringBuilder();
		for(char c : upperCase1) {
			if(Character.isUpperCase(c)){
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		System.out.println(sb.toString());
	}
}