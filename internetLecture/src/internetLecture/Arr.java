package internetLecture;

import java.util.ArrayList;
import java.util.List;

import hijava.oop.Mom;
import hijava.oop.Son;

public class Arr {
/**
 *  int[] nums = new int[5];
 *  int[] arrs = {1, 2, 3, 4, 5};
 *  Integer[] nums = new Integer[5];
 *  Integer[] nums = new Integer[]{1,2,3,4,5};
 */
	
	public static void main(String[] args) {
	//	ex1(); //int
	//	ex2(); //String
	//	ex3(); //클래스
	//	ex4(); //배열의 복사
	//	ex5(); //배열의 복사 system.arraycopy
	//	ex6(); //다차원배열  arr[행][열]   알파벳 대문자와 소문자를 2차원 배열을 이용하여 출력하시오. 참고로 A = (char)65임		
		Mom mom = new Mom();
		Mom son = new Son();
		
		if(son instanceof Son){
			System.out.println("아들");
		} else if(son instanceof Mom){
			System.out.println("엄마");
		} else{
			System.out.println("인스턴스가 없음!");
		}
	}
	

	private static void ex7() {
		List<Man> man = new ArrayList<Man>(9);
		System.out.println(man.size());
/*		for(int i = 0; i < man.size(); i++){
			man.add("김"+(i+1)+"수");
		}*/
		
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
	
	private static void ex4() {
		Man[] people = new Man[9];
		int len = people.length;

		for(int i = 0; i < len; i++) {
			people[i] = new Man("배열"+(i+1));
		}
		
		for(Man sibal : people){
			System.out.println(sibal);
		}
		
		Man[] people2 = new Man[len];
		
		for (int i = 0; i < len ; i++){
		//	people2[i] = people[i];
			people2[i] = new Man(people[i].getName());
		}
		
		people[0].setName("콘센시발");
		
		for (Man consibal: people){
			System.out.println("ex3 people : "+ consibal);
		}
		for (Man consibal: people2){
			System.out.println("ex3 people2 : "+consibal);
		}
	}

	private static void ex5() {
		int[] arr1 = {10, 20, 30, 40 ,50};
		int[] arr2 = {1, 2, 3, 4 ,5};
//		System.arraycopy(from, startIndex, to, startIndex, count);
		System.arraycopy(arr1, 2, arr2, 2, 3);
	
		for(int i = 0; i <arr2.length; i++) {
			System.out.println("ex4 :"+arr2[i]);
		}
	}
	private static void ex6() {
		int upperStart = 65;
		int lowerStart = 97;
		
		int[] starts= new int[]{ upperStart, lowerStart};
		char[][] arr = new char[2][26];
		
		for(int start = 0; start < starts.length; start++){
//		for(int start : starts){
			for ( int i = 0; i < 26 ; i++){
				int x = i+ starts[start];
//				System.out.println(x +":"+(char)x);
				arr[start][i] = (char)x;
			}
		}
		
		for(int i = 0; i <arr.length ; i ++){
			for(int j = 0; j<arr[i].length ; j++){
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}
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
