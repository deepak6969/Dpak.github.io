package labprogram;

public class case2conination {

	public static void main(String[] args) {
		int[]digits= {1,2,3,4};
		
		System.out.println("comnination without duplicates:");
		generateCombinations(digits,"",new boolean[digits.length],4);

	}
	public static void generateCombinations(int[]digits,String current,boolean[] used,int length) {
		if(length==0) {
			System.out.println(current);
			return;
		}
		for(int i=0;i<digits.length;i++) {
			if(!used[i]) {
				used[i]=true;
			}
			generateCombinations(digits,current+digits[i],used,length -1);
			used[i]=false;
		}
	}

}
