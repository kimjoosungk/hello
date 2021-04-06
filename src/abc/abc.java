package abc;

import java.util.Scanner;

public class abc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int a = sc.nextInt();
		
		for(int i = 2; i <= a; i++) {
			while(a % i == 0) {
				System.out.println(i);
				
				a /= i;
			}
		}
		
		
		for(int i = 2; i <= 1000; i++) {
			boolean yes = false;
			for(int j = 2; j < i; j++) {
				if(i%j==0) {
					yes=true;
					break;
				}
			}
			if(yes == false) System.out.println(i);
		}
	}
}
