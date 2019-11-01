
public class FasterPrimeCounter {
	public boolean isPrime(int N) {
		if(N==1||N==0) {
			return false;
		}
		for(int i=2; i<=N/2; i++) {
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
		FasterPrimeCounter test = new FasterPrimeCounter();
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
