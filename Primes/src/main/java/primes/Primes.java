package primes;

import java.util.Scanner;

class myprimes extends Primes implements Runnable{
	int limit;
	int lower;

	myprimes(int ul,int ll){
		this.limit=ul;
		this.lower=ll;
	}
	public void run() {

		for (int i = lower; i <= limit; i++)         
		{ 		  	  
			if(CheckForPrime(i)) {
				System.out.println(i);
			}
		}	
	}
}

public class Primes {
	//Method to check whether a Number is Prime or not.
	public boolean CheckForPrime(int number) {
		if (number <= 1) {
			return false;
		}
		int IterationValue = 2;
		while (IterationValue < number / 2) {
			if ((number % IterationValue) == 0) {
				return false;
			}
			IterationValue++;
		}
		return true;
	}
	//Main Method Executing Threads
	public static void main(String[] args) throws Exception {
		//Collecting input from the user.
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the upper limit for prime numbers:");
		int number=scan.nextInt();
		scan.close();
		int limit=(number/10)+number%10;
		int lower=1;
		//Creating Threads
		for(int j=1;j<=10;j++) {
			Thread mythread=new Thread(new myprimes(limit,lower));
			mythread.start();
			lower=limit+1;
			limit=limit+(number/10);
			System.out.println("#######");
			System.out.println("Thread id"+mythread.getId());
			System.out.println("#######");
			mythread.join();		
		}
	}
}
