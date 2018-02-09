
public class Numbers {

	public static boolean isPrime(int a) {

		int j = 2, brojac = 0;
		double gornjaGranica = (double) Math.sqrt(a);

		while (((double) j <= gornjaGranica) && (brojac == 0)) {
			if ((a % j) == 0) {
				brojac++;
			}
			j++;
		}
		return (brojac == 0);
	}

	// Write method that prints prime numbers less than 1000. An integer greater
	// than 1 is prime if its only positive divisor is 1 or itself. For example, 2,
	// 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.
	public static void printPrimes() {
		int i;
		int brojac = 0;

		for (i = 1; i <= 1000; i++) {

			if (isPrime(i)) {

				System.out.printf("%4s ", i);
				brojac++;
				if ((brojac % 8) == 0) {
					System.out.println();

				} // if brojac
			} // if prost

		} // for
	}

	// Write a method that displays the first 100 emirps. An emirp (prime spelled
	// backward) is a nonpalindromic prime number whose reversal is also a prime.
	// For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps
	public static void displayEmirps() {
		int brojaè = 1;
		int broj = 2;
		while (brojaè <= 100) {
			if (!isPalindrome(broj) && obrnutiBrojIsPrime(broj) && isPrime(broj)) {
				if (brojaè % 10 != 0) {
					System.out.print(broj + " ");
					brojaè++;
				} else {
					System.out.println(broj);
					brojaè++;
				}
			}
			broj++;
		}
	}

	// Write method that will Display Fibonacci numbers less than 100. The Fibonacci
	// Sequence is a series of integers. The first two numbers in the sequence are
	// both 1 ; after that, each number is the sum of the preceding two numbers. 1,
	// 1, 2, 3, 5, 8...
	public static void displayFibonacci() {
		int a = 1;
		int b = 1;
		while (a <= 100 && b <= 100) {
			System.out.println(a);
			System.out.println(b);
			a += b;
			b += a;
		}

	}

	// Write method that prints Marsenne primes. A prime number is called a Mersenne
	// prime if it can be written in the form 2p - 1 for some positive integer p.
	// Write a program that finds all Mersenne primes with p < =31
	public static void printMersennePrimes() {

	}

	// Write method that prints Armstrong numbers less than 1000. of three digits is
	// an integer such that the sum of the cubes of its digits is equal to the
	// number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 +
	// 1**3 = 371.
	public static void printArmstrongNumbers() {

	}

	// Write main method that will ask user to choose what method will he use. Ex.
	// if user chose that he wants Marsenne primes that will be option D.
	public static void main(String[] args) {
		// printPrimes();
	}

	/* Pomocne metode */

	public static boolean obrnutiBrojIsPrime(int a) {
		int b = 0;
		while (a > 0) {
			b = b * 10 + a % 10;
			a = a / 10;
		}
		for (int i = 2; i <= b / 2; i++) {
			if (b % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(int a) {
		int b = 0;
		int c = a;
		while (a > 0) {
			b = b * 10 + a % 10;
			a = a / 10;
		}
		if (b == c) {
			return true;
		}
		return false;
	}

}
