package hijava.oop;

public class Oper{
	public int add(int x, int y){
		return x + y;
	}
	
	public int sub(int x, int y){
		return x - y;
	}
	
	public void mul(int x, int y){
		int result = 0;
		for(int i = 0; i < y; i++){
			result = add(result, x);
		}
		System.out.println(result);
	}
	
	public void div(int x, int y){
		int result = 0;
		while( x > 0) {
			result++;
			x = x - y;
		}
		System.out.println(result);
	}
	
/*	public static void main(String[] args) {
		int x = 10, y = 5;
		
		Oper op = new Oper();
		System.out.println(op.add(x, y));
		System.out.println(op.sub(x, y));
		System.out.println(op.mul(x, y));
		System.out.println(op.div(x, y));
	
		
	}*/
}
