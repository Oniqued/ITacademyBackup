package projectA01;
/******************
 * 
 * 개발자 : Onique
 * 합을 계산하기 
 *
 */

public class projectA0104 { //public이 붙은 class는 파일 이름과 같아야 한다 
	/*
	 * 프로그램 시작
	 */
	
	
	public static void main(String[] args) { //모든 action이 일어나는 함수 
		System.out.print("Hello"); //출력 
		System.out.print(" World!\n");
		System.out.print("Hello");
		System.out.println(" World!");
		System.out.println();
		
		int ia = 10;
		int ib = 20;
		int sum = sum(ia, ib);
		
		System.out.println("sum = " + sum);
		System.out.println(10+20);
		System.out.println(ia);
		System.out.println(ib);
		
		piramid(10);
		
		
	}
	/*
	 * a , b 더하기 
	 */
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static void piramid(int size) {
		for(int i = 1; i <= size; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = size - 1; i <= 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
