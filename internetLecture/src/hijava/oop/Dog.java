package hijava.oop;

public class Dog extends Animal{

	@Override
	public String bark() {
		return "멍멍";
	}
	
	@Override
	public String toString(){
		return "월월";
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d);
		
		String s = "Test : " + d ;
		
		System.out.println(s);
	}
	
	
}
