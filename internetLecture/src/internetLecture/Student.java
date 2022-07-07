package internetLecture;

public class Student {
	private String studentNo;
	private String name;
	private int age;
	private String telNo;
	
	public Student(){
		
	}
	public Student(String name){
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelNo() {
		if(this.telNo == null && this.telNo.length() < 4){
			return telNo;
		} else {
			return telNo.substring(0, telNo.length() - 4);
		}
	}
	
	//010-9999-8888
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNo(){
		return this.studentNo;
	}
	
	public void setStudentNo(String studentNo){
		this.studentNo = studentNo;
	}
	
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + ", telNo=" + telNo + "]";
	}
	
	
}
