package baekjoon;
import java.util.Scanner;
//1712 ���ͺб���
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��������� �Է��ϼ���(����: ����): ");
		int a = scan.nextInt();
		System.out.print("��������� �Է��ϼ���(����: ����): ");
		int b = scan.nextInt();
		System.out.print("��Ʈ�� ������ �Է��ϼ���(����: ����): ");
		int c = scan.nextInt();

		int i=0;

		while(true) {
			i++;
			int cost = b*i;
			cost = a+cost;
			int income = c*i;

			if (income > cost) 
				break;
		}
		
//		if (i > 210000000) 
//			System.out.println(-1);
//
//		else
//			System.out.println(i);

		scan.close();

	}

}
