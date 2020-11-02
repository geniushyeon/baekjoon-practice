package baekjoon;
import java.util.Scanner;
//1712 손익분기점
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("고정비용을 입력하세요(단위: 만원): ");
		int a = scan.nextInt();
		System.out.print("가변비용을 입력하세요(단위: 만원): ");
		int b = scan.nextInt();
		System.out.print("노트북 가격을 입력하세요(단위: 만원): ");
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
		System.out.println(i);
		
		scan.close();

	}

}
