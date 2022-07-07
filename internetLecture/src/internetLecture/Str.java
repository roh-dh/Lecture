package internetLecture;

public class Str {

	public static void main(String[] args) {
		subStrTest();
	}

	private static void subStrTest() {
		String s = "010-1234-1234";
		String s1 = s.substring(0, 9);
		String s2 = s.substring(0,s.length()-4)+"****";
		System.out.println(s2);
	}
}
