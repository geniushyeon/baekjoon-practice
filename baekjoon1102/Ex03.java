package baekjoon;
//윤년
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("계산하고 싶은 연도를 입력하세요: ");
		int y = scan.nextInt();
		
		if (y%4 == 0 && y%100 != 0 || y%400 == 0) {
			System.out.println(1);
		}
		else
			System.out.println(0);
		
		scan.close();
	}
}
