import java.util.Scanner;

public class Numbers {
	
	public static boolean isPrime(int a){
		
		int j=2, brojac=0;
		double gornjaGranica = (double) Math.sqrt(a);
		
		while (( (double)j<=gornjaGranica) && (brojac == 0)){
			if ((a%j)==0) {
				brojac++;
			}
			j++;
		}
		
		return (brojac==0);
	}
	

//	Write method that prints prime numbers less than 1000. An integer greater than 1 is prime if its only positive divisor is 1 or itself. For example, 2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.
	public static void printPrimes(){
		int i;
		int brojac=0;
		
		
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

	//	 Write a method that displays the first 100 emirps. An emirp (prime spelled backward) is a nonpalindromic prime number whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps
	public static void displayEmirps(){
		int i=12;
		int brojac=0;
		int numberOfEmirps=0;
		
		System.out.println("First 100 emirps are:");
		while (numberOfEmirps<101){
			if (isPrime(i)){
				String originPrime=Integer.toString(i);
				String reversePrime="";
				int emirp=0;
				for(int j=originPrime.length()-1; j>=0; j--){
					reversePrime += originPrime.charAt(j);
				}
				emirp = Integer.parseInt(reversePrime);
				if (isPrime(emirp) && (emirp!=i)){
					numberOfEmirps++;
					System.out.printf("%4s ",i);
					brojac++;
					if ((brojac % 8) == 0) {
						System.out.println();

					} // if brojac
				}
				
			}
			i++;
		}
		
		
	}
	
//	Write method that will Display Fibonacci  numbers less than 100. The Fibonacci Sequence is a series of integers. The first two numbers in the sequence are both 1 ; after that, each number is the sum of the preceding two numbers. 1, 1, 2, 3, 5, 8...
	public static void displayFibonacci(){
		int a=1;
		int b=1;
		while (a<=100 && b<=100) {
			System.out.println(a);
			System.out.println(b);
			a+=b;
			b+=a;
		}
		
	}
	
//	Write method that prints Marsenne primes. A prime number is called a Mersenne prime if it can be written in the form 2p - 1 for some positive integer p. Write a program that finds all Mersenne primes with p < =31
	public static void printMersennePrimes(){
		System.out.println("Mersenne primes are:");
		for(int p=2; p<=31;p++){
			int mersenn=(int)Math.pow(2, p)-1;
			if (isPrime(mersenn)){
				System.out.printf("%4s ", mersenn);
			}
		}
	}
	
//	Write method that prints Armstrong numbers less than 1000.  of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
	public static void printArmstrongNumbers(){
		int num,rem,sum = 0;
		System.out.println("Armstrong numbers are:");
		for (int i = 1; i <= 1000; i++)
		{
			num = i;
			while (num > 0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
	 
			if (sum == i)
			{
				System.out.print(i + " ");
			}
			sum = 0;
		}
	}
	
//	Write main method that will ask user to choose what method will he use. Ex. if user chose that he wants Marsenne primes that will be option D.
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println ("Choose number for:");
		System.out.println("_________________________________________");
		System.out.println("1. Print prime numbers less than 1000");
		System.out.println("2. Display the first 100 emirps");
		System.out.println("3. Display Fibonacci  numbers less than 100");
		System.out.println("4. Print Marsenne primes");
		System.out.println("5. Print Armstrong numbers less than 1000");
		System.out.println("_________________________________________");

		int izbor=unos.nextInt();
		switch (izbor) {
		case 1:
			printPrimes();
			break;
		case 2:
			displayEmirps();
			break;
		case 3:
			displayFibonacci();
			break;
		case 4: 
			printMersennePrimes();
			break;
		case 5:
			printArmstrongNumbers();
			break;

		default:
			System.out.println("Wrong input!");
			break;
			
		}
		unos.close();
	}

}
