package baekjoon;
import java.util.Scanner;
//알람 설정
public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("알람을 맞출 시간을 입력하세요. ");
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if (M < 45) 
			System.out.println(H-1 + " " + ((M-45) + 60));
					
		else
			System.out.println(H + " " + (M-45));
		
		System.out.println("알람을 45분 일찍 맞췄습니다.");
		scan.close();
	}

}
