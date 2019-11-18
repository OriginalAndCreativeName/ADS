
public class Tester {
	/*
	 *Square root
	 *Num Primes 100:25
Total Time:1
Num Primes 1000:168
Total Time:0
Num Primes 10000:1229
Total Time:2
Num Primes 100000:9592
Total Time:31
Num Primes 1000000:78498
Total Time:735
Num Primes 10000000:664579
Total Time:18746
Num Primes 100000000:5761455
Total Time:505398



	 * */
	public static void main(String[] args) {
		FastestPrimeCounter test = new FastestPrimeCounter();
		
		long start = System.currentTimeMillis();
		System.out.println("Num Primes 100:" + test.countPrimes(100));
		long end = System.currentTimeMillis();
		System.out.println("Total Time:"  + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Num Primes 1000:" + test.countPrimes(1000));
		end = System.currentTimeMillis();
		System.out.println("Total Time:"  + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Num Primes 10000:" + test.countPrimes(10000));
		end = System.currentTimeMillis();
		System.out.println("Total Time:"  + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Num Primes 100000:" + test.countPrimes(100000));
		end = System.currentTimeMillis();
		System.out.println("Total Time:"  + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Num Primes 1000000:" + test.countPrimes(1000000));
		end = System.currentTimeMillis();
		System.out.println("Total Time:"  + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Num Primes 10000000:" + test.countPrimes(10000000));
		end = System.currentTimeMillis();
		System.out.println("Total Time:"  + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Num Primes 100000000:" + test.countPrimes(100000000));
		end = System.currentTimeMillis();
		System.out.println("Total Time:"  + (end-start));
	}

}
