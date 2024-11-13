package section2string;

import java.util.Scanner;

/*
* 문제
* 설명
* 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
* 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

* 입력
* 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

 * 출력
* 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

* 예시 입력 1
* a#b!GE*T@S


 * 예시 출력 1
 * S#T!EG*b@a
* */
public class Main {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		solution(kb.next());
	}

	private static void solution(String input) {
		char[] chars = input.toCharArray();

		int lt = 0, rt = chars.length - 1;
		while (lt < rt) {
			if (!Character.isAlphabetic(chars[lt])) { lt++; }
			else if(!Character.isAlphabetic(chars[rt])) { rt--; }
			else {
				char tmp = chars[lt];
				chars[lt] = chars[rt];
				chars[rt] = tmp;
				lt++; rt--;
			}
		}

		System.out.println(String.valueOf(chars));
	}
}