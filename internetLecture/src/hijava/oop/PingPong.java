package hijava.oop;

public class PingPong extends NetSport{

	@Override
	public void serve() {
		System.out.println("Sky Service!");
	}

	@Override
	public void hit() {
		System.out.println("smash");
	}

	@Override
	public void score() {
		System.out.println("1");
	}

}
