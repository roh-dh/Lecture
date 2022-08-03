package hijava.oop;

public class WebSite extends SoftWare{

	@Override
	public void plan() {
		System.out.println("웹사이트 기획");
	}

	@Override
	public void develop() {
		System.out.println("웹사이트 개발");
	}

	@Override
	public void release() {
		System.out.println("웹사이트 출시");
	}

}
