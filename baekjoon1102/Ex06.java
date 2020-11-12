package baekjoon;
import java.util.Scanner;
//구구단
public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단을 출력할 숫자를 입력하세요: ");
		int n = scan.nextInt();
		
		for (int i=1; i<10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
		scan.close();
	}

}
