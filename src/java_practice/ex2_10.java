package java_practice;

import java.util.Scanner;

public class ex2_10 {
	public static void main(String[] args) {
		// 입력값 받기
		Scanner scanner = new Scanner(System.in);

		// 출력
		System.out.print("점수를 입력하시오: ");

		// 입력받은 값을 score에 담기
		int score = scanner.nextInt();

		// if 조건문
		if (score >= 80)
			System.out.println("축하합니다! 합격입니다."); // 출력

		scanner.close(); // 원래 안적어도 됌

		// TODO Auto-generated method stub

	}

}
