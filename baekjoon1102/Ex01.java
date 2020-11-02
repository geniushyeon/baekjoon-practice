package baekjoon;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개를 엔터로 구분하여 입력하세요.");
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		
		int output1 = input1*(input2%10);
		int output2 = input1*((input2%100)/10);
		int output3 = input1*(input2/100);
		int output4 = input1*input2;
		
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		System.out.println(output4);
		
		scan.close();
	}
	
}
