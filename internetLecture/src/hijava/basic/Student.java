package hijava.basic;

public class Student {
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return name + "(" + id + ")";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	//if (s1 != null && s1.equals(s2))
	@Override
	public boolean equals(Object obj) {
/*		//동일한 메모리 주소면 true
		if (this == obj)			
			return true;
		
		// this는 절대 null이 될 수 없으므로  obj가 null이면 false!!		this:s1	obj:s2
		if (obj == null)
			return false;
		
		// 동일한 class type이 아니면 false
		if (getClass() != obj.getClass())
			return false;
		
		
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;*/
		
		Student other = (Student)obj;
		return this.id == other.id && this.name != null && this.name.equals(other.name);
	}

	public static void main(String[] args) {
		Student s = new Student(921234,"홍길동");
		
		System.out.println(s);
		String ss = new String("홍길동1");
		Integer obj = new Integer(s.id);
		Integer obj2 = new Integer(921234);
		System.out.println(s.name.hashCode()+"::"+ss.hashCode());
		System.out.println(obj.hashCode()+"::"+obj2.hashCode());		
		System.out.println(System.identityHashCode(obj2)); 
		
		
		Student s1 = new Student(123,"hong");
		Student s2 = new Student(456,"hong");
		Student s3 = new Student(123,"hong");
		System.out.println(s1.equals(s3)); 
		System.out.println(s2.equals(s3));
	}
}
