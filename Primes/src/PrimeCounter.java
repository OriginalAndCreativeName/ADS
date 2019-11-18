
public class PrimeCounter {
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
	private boolean[] primes;
	/*public boolean isPrime(int N) {
		for(int i=0; i<numPrimes && alreadyFound[i]<=Math.sqrt(N); i++) {
			if(N%alreadyFound[i]==0 ) {
				return false;
			}
		}
		return true;
	}*/
	public int countPrimes(int limit) {
		primes = new boolean[limit+1];
		int numPrimes=0;
		int i=2;
		while(i<limit) {
			if(!primes[i]) {
				for(int j=0; j<limit/i; j++) {
					primes[i+j*i]=true;
				}
				numPrimes+=1;
			}
			i++;
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
		PrimeCounter test = new PrimeCounter();
		long start = System.currentTimeMillis();
		System.out.println("Primes up to 100: " + test.countPrimes(100));
		long end = System.currentTimeMillis();
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
