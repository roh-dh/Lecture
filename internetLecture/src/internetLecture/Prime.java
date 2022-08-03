package internetLecture;

import java.util.ArrayList;

public class Prime {
	public static void main(String[] args) {
		int total = 0;
		
		for(int num = 2; num <= 1000000; num++){
			
			if(isPrime(num)){
				total += num;
			}
		}
		System.out.println(total);
	}
	//소수 판별
	private static final ArrayList<Integer> primeList = new ArrayList<>();
	
	
	private static boolean isPrime(int num){
		
//		for (int j = 2; j < num; j++) {
		for (Integer j : primeList) {
			if(num % j == 0) {
				return false;
			}
		}
		primeList.add(num);
		return true;
	}
}


