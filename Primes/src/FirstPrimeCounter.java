
public class FirstPrimeCounter {
	public boolean isPrime(int N) {
		if(N==1|N==0) {
			return false;
		}
		for(int i=2; i<N; i++) {
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
		FirstPrimeCounter test = new FirstPrimeCounter();
		long start = System.currentTimeMillis();
		System.out.println(test.countPrimes(1000));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
