package baekjoon;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� A�� �Է��ϼ���: ");
		int A = scan.nextInt();
		System.out.print("���� B�� �Է��ϼ���: ");
		int B = scan.nextInt();
		System.out.print("���� C�� �Է��ϼ���: ");
		int C = scan.nextInt();
		
		int res1 = (A+B)%C;
		int res2 = ((A%C) + (B%C));
		int res3 = (A*B)%C;
		int res4 = ((A%C) * (B%C));
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		scan.close();
		
	}

}
