package hijava.oop;

public class CalculatorImpl implements Calculator{

	@Override
	public int add(int i, int j) {
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		return i-j;
	}

	@Override
	public int mul(int i, int j) {
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		if(j==0){
			return 0;
		} else{
			return i/j;
		}
			
	}

}
