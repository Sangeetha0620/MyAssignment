package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range=8;
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2 );

	    for (int i = 2; i < range; i++) {

	        int num3 = num1 + num2;

	        System.out.print(" "+num3 );

	        num1 = num2;
	        num2 = num3;
		}
		
	}

}
