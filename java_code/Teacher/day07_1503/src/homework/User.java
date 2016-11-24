package homework;
/*
 * 账户类
 *   name:账户名
 *   password：密码
 *   account:账户余额
 */
public class User {
	private String name;
	private String password;
	private int account;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public void saveMoney(int r) {
		account+= r;		
	}
	
	

}
