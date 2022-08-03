package internetLecture;

public class Man {
	
	private String name;
	private int amount = 10000;
	public final static int coffee = 3000;
	public final static int donut = 2500;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public static int getCoffee() {
		return coffee;
	}
	public static int getDonut() {
		return donut;
	}

	
	public Man() {
		this.amount = 10000;
	}
	public Man(String name) {
		this();
		this.name = name;
	}
	
	
	public void buyCoffee(int count){
//		this.amount -= this.coffee * count; //�����丵 Ŀ�ǰ����� �������� �����־�
		this.subAmount(coffee, count);
	}
	
	public void buyDonut(int count){
//		this.amount -= this.donut * count;   //�����丵 ���Ӱ����� �������� �����־�
		this.subAmount(donut, count);
	}

	
	private void subAmount(int price, int count){
		this.amount -= price * count +(price * count) * 0.1;
	}	public String toString() {
		return this.name + "의 잔액은 : "+ this.amount+"입니다.";
	}
	
	public static void main(String[] args) {
		Man hong = new Man("hong");
		hong.buyCoffee(2);
		hong.buyDonut(1);
		System.out.println(hong.toString());

		
		Man john = new Man("john");
		john.buyCoffee(1);
		john.buyDonut(1);
		System.out.println(john.toString());
		
	}
	
}
