package hijava.oop;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import internetLecture.*;

/**
 * 
 * @author dhroh
 * 9명의 man을 ArrayList에 담고, 9명 모두 커피 1잔씩을 사먹게 한 뒤, 9명의 잔액을 출력하는 코드를 작성하시오.
 */


public class Main {
	public static void main(String[] args) throws SQLException, IOException { // main은 stack영역
		
		Man hong = new Man("Hong");
		Man kim = new Man("kim");
		Man kildong = hong;
		Man ilsoo = new Man("kim");
		
		System.out.println(hong.equals(kim));	//fasle
		System.out.println(hong.equals(kildong));	//true
		System.out.println(kim.equals(ilsoo));	//false
		
		System.out.println("hong hash---------"+hong.hashCode());
		System.out.println("kim hash------------"+kim.hashCode());
		System.out.println("kildong hash---------"+kildong.hashCode());
		System.out.println("kildong real hashcode----------"+System.identityHashCode(kildong));
		
		
//		total();
		
//		Calculator();
		
//		testinterfeace();
		
//		softWare();
//		netsport();
//		weight();
//		Animal();
//		AbstSuper sp = new AbstChild();
//		int i = 5;
//		int j = 10;
//		System.out.println("max = "+sp.max(i, j)+"min = "+sp.min(i, j));
		
		
//		ex1();
//		Mom mom = new Mom();
//		Mom son = new Son();
//		mom.say();
//		son.say();
//		mom.eat();
//		son.eat();
		
//		scanner();
		scanner2();
	}

	
	private static void scanner2() {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("계속하시겠습니까?--- 계속하기(Enter) 그만하기(Quit)");
			String s = sc.nextLine();
			if(s.equals("quit")) break;
			
			int x = inputScanNumber(sc, "첫번째 숫자(x)를 입력하세요");
			int y = inputScanNumber(sc, "두번째 숫자(x)를 입력하세요");
			
			
			System.out.println("연산자(* 또는 / 를) 입력하세요");
			String op = sc.nextLine();
			CalcOper co = new CalcOper();
			if(op.equals("*")){
				co.mul(x, y);
			} else if(op.equals("/")){
				co.div(x, y);
			} else{
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		sc.close();
	}


	private static int inputScanNumber(Scanner sc, String msg) {
		System.out.println(msg);
		int x = Integer.parseInt(inputScan(sc, msg)); 
		System.out.println("x = "+x);
		return x;
		
	} 
	
	private static String inputScan(Scanner sc, String msg) {
		System.out.println();
		return sc.nextLine();
	}



	/*private static void scanner2() {
		Scanner sc = new Scanner(System.in);
		int x = inputScanNumber(sc, "첫번째 숫자(x)를 입력하세요>>");
		int y = inputScanNumber(sc, "두번째 숫자(y)를 입력하세요>>");
		
		String op = inputScan(sc,"연산자(* 또는 /)를 이벽하세요 >>");
//		System.out.println("연산자="+op);

		
		CalcOper co = new CalcOper();
		System.out.println(x+ " "+ op + " "+ y + " = " );
		
		if ("*".equals(op)){
			co.mul(x, y);
		} else if("/".equals(op)){
			co.div(x, y);
		} else {
			System.out.println("연산자를 정확히 입력하세요 !!");
		}
		sc.close();
		
	}

	private static int inputScanNumber(Scanner sc, String msg) {
		int x = Integer.parseInt(inputScan(sc,msg));		
		return x;
	}
	
	private static String inputScan(Scanner sc, String msg){
		System.out.print(msg);
		return sc.nextLine();
	}
*/
	private static void scanner() {
		System.out.print("문자열을 입력하세요 >>");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		System.out.println("Msg = "+ msg);
		
		System.out.print("숫자를 입력하세요 >>");
		double inputNum = scanner.nextDouble();
		System.out.println("Input Number is "+ inputNum);
		scanner.close();
	}

	private static void total() {
		Total t = new TotalImpl();
		int[] nums = {10,100};
		
		System.out.println(t.sum(nums));
		System.out.println(t.avg(nums));
	}

	private static void testinterfeace() throws SQLException, IOException {
		TestInterface ti = new TestImpl();
		ti.select("select * from Table");
		TestInterface.out(100);
	}

	private static void Calculator() {
		Calculator cal = new CalculatorImpl();
		int i = 5;
		int j = 10;
		System.out.println(cal.add(i, j));
		System.out.println(cal.sub(i, j));
		System.out.println(cal.mul(i, j));
		System.out.println(cal.div(i, j));
	}

	private static void softWare() {
		SoftWare webSite = new WebSite();
		SoftWare mobileApp = new MobileApp();
	
		webSite.product();
		System.out.println("---------------");
		mobileApp.product();
	}

	private static void netsport() {
		NetSport pp = new PingPong();
		NetSport te = new Tennis();
		pp.play();
		System.out.println("-------");
		te.play();
	}

	private static void Animal() {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		barkAnimal(dog);
		barkAnimal(cat);
		
	}

	private static void barkAnimal(Animal ani) {
		System.out.println(ani.bark());
	}

	private static void weight() {
		Weight guen = new Guen();
		Weight pound = new Pound();
		
		int cnt = 5;
		System.out.println("Guen="+ guen.getGram(cnt));
		System.out.println("Pound="+ pound.getGram(cnt));
	}

	private static void ex1() {
		ArrayList<Man> people = new ArrayList<>(9);
		for(int i = 0; i < 9; i++){
			Man m = new Man("김"+(i+1)+"수"); // man 인스턴스 생성: 인스턴스는 heap메모리에 들어감 
			m.buyCoffee(1);	 //커피사먹기 이것도 heap에 들어감
			people.add(m);   //이건 스택 영역에 들
			System.out.println(m);
		}
		int size = people.size();
		for (int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
	}
}
