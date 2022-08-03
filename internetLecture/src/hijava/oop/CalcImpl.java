package hijava.oop;

public class CalcImpl implements Calc {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public void mul(int x, int y) {
		System.out.println(x * y);
	}

	@Override
	public void div(int x, int y) {
		System.out.println(x / y);
	}
	
}
