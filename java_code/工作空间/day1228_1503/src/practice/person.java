package practice;

public class person implements Runnable {
	private Account account;
	@Override
	
	public void run() {
		double s=account.getNumber();
		s+=1000;
		account.setNumber(s);
		System.out.println(Thread.currentThread().getName()+"�����˻���"+account.getName()+"��"+s);

	}
	public person(Account account) {
	
		this.account = account;
	}

}
