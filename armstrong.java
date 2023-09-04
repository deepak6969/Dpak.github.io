package labprogram;

import java.util.Scanner;

;

public class armstrong {
	public static void main(String[]arg) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter a numbe:");
		int number=scanner.nextInt();
		int originalNumber=number;
		
		int temp,digits=0,last=0,sum=0;
		
		while(number>0) {
			number=number/10;
			digits++;
		}
		number=originalNumber;
		while(number>0) {
			last=number%10;
			sum+=Math.pow(last, digits);
			number=number/10;
		}
		if(sum == originalNumber) {
			System.out.println(originalNumber+"is an armstrong");
		}else {
			System.out.println(originalNumber+"is not an armstrong");
		}
	}
}
