package internetLecture;

public class Score {
	private String subject;
	private int score;
	
	public Score(){
		
	}
	
	public Score(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject(){
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setScore(int score){
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Score [subject=" + subject + ", score=" + score + "]";
	}
}
