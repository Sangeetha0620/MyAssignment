package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 29;

		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		}

		else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(number + " is a prime number.");
			} else {
				System.out.println(number + " is a not prime number.");

			}
		}
	}
}
