package baekjoon;
import java.util.Scanner;
//�˶� ����
public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�˶��� ���� �ð��� �Է��ϼ���. ");
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if (M < 45) 
			System.out.println(H-1 + " " + ((M-45) + 60));
					
		else
			System.out.println(H + " " + (M-45));
		
		System.out.println("�˶��� 45�� ���� ������ϴ�.");
		scan.close();
	}

}
