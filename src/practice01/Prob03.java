package practice01;

import java.util.Scanner;

public class Prob03 {
	public static void main(String[] args) {
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		while(num > 0) {
			sum += num;
			num -= 2;
		}
		
		System.out.println("결과 값: " + sum);
	}
}
