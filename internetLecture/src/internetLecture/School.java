package internetLecture;

public class School {
	public static void main(String[] args) {
		Score korean = new Score();
		korean.setSubject("����");
		korean.setScore(50);
		
		Score math = new Score("����",50);
		System.out.println(korean.toString());
		System.out.println(math.toString());
	}
}
