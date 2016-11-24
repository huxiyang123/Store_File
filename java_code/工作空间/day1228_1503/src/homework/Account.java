package homework;

public class Account {
	private String name;
	private double money;
	private double save;
	
	public double getSave() {
		return save;
	}

	
	public void setSave(double save) {
		this.save = save;
	}

	private double  takeout;
	
	
	public double getTakeout() {
		return takeout;
	}

	public void setTakeout(double takeout) {
		this.takeout = takeout;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMoney() {
		return money;
	}
	

	public void setMoney(double money) {
		this.money = money;
	}


	public Account(String name, double money, double save, double takeout) {
		super();
		this.name = name;
		this.money = money;
		this.save = save;
		this.takeout = takeout;
	}
}
