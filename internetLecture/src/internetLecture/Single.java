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
//�̱����� Ŭ�������� �ٷ� �ҷ��� 