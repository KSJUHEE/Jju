package java_practice;

import java.util.Scanner;

public class ex2_10 {
	public static void main(String[] args) {
		// �Է°� �ޱ�
		Scanner scanner = new Scanner(System.in);

		// ���
		System.out.print("������ �Է��Ͻÿ�: ");

		// �Է¹��� ���� score�� ���
		int score = scanner.nextInt();

		// if ���ǹ�
		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�."); // ���

		scanner.close(); // ���� ����� ��

		// TODO Auto-generated method stub

	}

}
