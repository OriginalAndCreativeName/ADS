
public class FastestPrimeCounter {
	/*
	 * Primes up to 100: 25
time 0
Primes up to 1000: 168
time 1
Primes up to 10000: 1229
time 0
Primes up to 100000: 9592
time 6
Primes up to 1000000: 78498
time 46
Primes up to 10000000: 664579
time 862
Primes up to 100000000: 5761455
time 17984
	 */
	private int numPrimes;
	private int[] alreadyFound;
	public boolean isPrime(int N) {
		for(int i=0; i<numPrimes && alreadyFound[i]<=Math.sqrt(N); i++) {
			if(N%alreadyFound[i]==0 ) {
				return false;
			}
		}
		return true;
	}
	public int countPrimes(int limit) {
		alreadyFound = new int[1];
		alreadyFound[0]=2;
		numPrimes=1;
		for(int i=3; i<=limit; i++) {
			if(isPrime(i)) {
				if(numPrimes>=alreadyFound.length) {
					alreadyFound=doubleSize(alreadyFound);
				}
				alreadyFound[numPrimes]=i;
				numPrimes++;
			}
		}
		return numPrimes;

	}
	private int[] doubleSize(int[] in) {
		int[] out = new int[in.length*2];
		for(int i=0; i<in.length; i++) {
			out[i]=in[i];
		}
		return out;
	}
	public static void main(String[] args) {
		FastestPrimeCounter test = new FastestPrimeCounter();
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
