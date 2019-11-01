
public class SquareRootPrimeCounter {
	/*
	 * Primes up to 100: 25
time 0
Primes up to 1000: 168
time 0
Primes up to 10000: 1229
time 1
Primes up to 100000: 9592
time 11
Primes up to 1000000: 78498
time 224
Primes up to 10000000: 664579
time 7824
Primes up to 100000000: 5761455
time 209372
	 */
	public boolean isPrime(int N) {
		if(N==1||N==0) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(N); i++) {
			if(N%i==0) {
				return false;
			}
		}
		return true;
	}
	public int countPrimes(int limit) {
		int numPrimes=0;
		for(int i=1; i<limit+1; i++) {
			if(isPrime(i)) {
				numPrimes++;
			}
		}
		return numPrimes;
	}
	public static void main(String[] args) {
		SquareRootPrimeCounter test = new SquareRootPrimeCounter();
		long start = System.currentTimeMillis();
		System.out.println("Primes up to 100: " + test.countPrimes(100));
		long end = System.currentTimeMillis();
		System.out.println("time " + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Primes up to 1000: " + test.countPrimes(1000));
		end = System.currentTimeMillis();
		System.out.println("time " + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Primes up to 10000: " + test.countPrimes(10000));
		end = System.currentTimeMillis();
		System.out.println("time " + (end-start));

		start = System.currentTimeMillis();
		System.out.println("Primes up to 100000: " + test.countPrimes(100000));
		end = System.currentTimeMillis();
		System.out.println("time " + (end-start));

		start = System.currentTimeMillis();
		System.out.println("Primes up to 1000000: " + test.countPrimes(1000000));
		end = System.currentTimeMillis();
		System.out.println("time " + (end-start));

		start = System.currentTimeMillis();
		System.out.println("Primes up to 10000000: " + test.countPrimes(10000000));
		end = System.currentTimeMillis();
		System.out.println("time " + (end-start));
		
		start = System.currentTimeMillis();
		System.out.println("Primes up to 100000000: " + test.countPrimes(100000000));
		end = System.currentTimeMillis();
		System.out.println("time " + (end-start));
	}
}
