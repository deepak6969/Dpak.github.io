package labprogram;

public class primenumbers {

	public static void main(String[] args) {
		int n=10;
		int m=50;
		System.out.println("prime numbers betwen"+n+"and"+m+":");
		
		for(int i=n;i<m;i++) {
			if(isPrime(i)) {
				System.out.print(i+"");
				
			}
		}
		

	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
