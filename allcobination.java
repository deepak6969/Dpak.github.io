package labprogram;

public class allcobination {

	public static void main(String[] args) {
		int[]digits= {1,2,3,4};
		
		System.out.println("comnination with duplicates:");
		generateCombinations(digits,"",4);

	}
	public static void generateCombinations(int[]digits,String current,int length) {
		if(length==0) {
			System.out.println(current);
			return;
		}
		for(int i=0;i<digits.length;i++) {
			generateCombinations(digits,current+digits[i],length -1);
		}
	}

}
