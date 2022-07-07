package internetLecture;

public class Person {
	public static final String KOREAN = "»ç¶÷";
	public String name;
	protected String tel;
	private String ssn1;
	private String ssn2;

	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn1 + "*******";
	}
	
	Person p1 = new Person("±èÀÏ¼ö");
	Person p2 = new Person("±èÀÌ¼ö");
	
}
