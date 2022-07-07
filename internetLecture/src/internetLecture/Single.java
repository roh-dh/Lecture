package internetLecture;

public class Single {

	private Single _instance;
	private Single() {};
	public Single getInstance(){
		if(_instance == null)
			_instance = new Single();
		return _instance;
	}
}
//싱글턴은 클래스에서 바로 불러서 