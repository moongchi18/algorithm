package section2string;

import java.util.Scanner;

/*
* 문제
* 설명
* 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를
* 출력하는 프로그램을 작성하세요.

 * 입력
* 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
* 문자열의 길이는 100을 넘지 않는다.

 * 출력
* 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

 * 예시 입력 1
* teachermode e


 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
* */
public class Main {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		solution(kb.nextLine());
	}

	private static void solution(String input) {
		String[] tokens = input.split(" ");

		char[] chars = tokens[0].toCharArray();
		char target = tokens[1].charAt(0);

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < chars.length; i++){
			int distance = getDistance(chars, i, target);
			sb.append(distance + " ");
		}
		System.out.println(sb.substring(0, sb.length() - 1));
	}

	private static int getDistance(char[] chars, int i, char target) {
		if(chars[i] == target){ return 0;}
		int leftDistance = getLeftPoint(chars, i, target) - i;
		int rightDistance = getRightPoint(chars, i, target) - i;

		return Math.min(Math.abs(leftDistance), Math.abs(rightDistance));
	}

	private static int getLeftPoint(char[] chars, int i, char target) {
		if (i < 0) {
			return Integer.MAX_VALUE;
		} else if (chars[i] == target) {
			return i;
		} else {
			return getLeftPoint(chars, i - 1, target);
		}
	}

	private static int getRightPoint(char[] chars, int i, char target) {
		if (i > chars.length - 1) {
			return Integer.MAX_VALUE;
		} else if (chars[i] == target) {
			return i;
		} else {
			return getRightPoint(chars, i + 1, target);
		}
	}
}