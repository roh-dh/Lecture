package internetLecture;

public class Arr {
/**
 *  int[] nums = new int[5];
 *  int[] arrs = {1, 2, 3, 4, 5};
 *  Integer[] nums = new Integer[5];
 *  Integer[] nums = new Integer[]{1,2,3,4,5};
 */
	
	public static void main(String[] args) {
		ex1();
		ex2(); //
		ex3(); //클래스
		ex4(); //배열의 복사
	}


	private static void ex4() {
		Man[] people = new Man[9];
		int len = people.length;
		for (int i = 0; i < len; i++){
//			Man m = new Man("김 "+(i+1)+"수");   temp함수
//			people[i] = m;
			people[i] = new Man("김"+(i+1)+"수");
		}
		
}


	private static void ex3() {
	Man[] people = new Man[9];
	int len = people.length;
	for (int i = 0; i < len; i++){
//		Man m = new Man("김 "+(i+1)+"수");   temp함수
//		people[i] = m;
		people[i] = new Man("김"+(i+1)+"수");
	}
	
	for(Man man : people){
		System.out.println(man);
	}
	
}


	private static void ex1() {
		int[] nums = new int[100];
		int len = nums.length;
		for (int i = 0; i < len ; i++){
			nums[i] = i+1;
		}
		
		printArray(nums, len);
	}
	
	private static void ex2() {
		String[] strs = new String[100];
		int len = strs.length;
		
		for(int i =0; i< len; i++) {
			strs[i] = "strs"+(i+1);
		}
		
		printArray(strs, len);
	}


	private static void printArray(int[] nums, int len) {
		for(int i = 0; i< len; i++) {
			System.out.println(nums[i]);
		}
	}
	private static void printArray(String[] strs, int len) {
		for(int i = 0; i< len; i++) {
			System.out.println(strs[i]);
		}
	}
	
	
}
