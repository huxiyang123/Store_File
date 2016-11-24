package homework;

public class Card {
	private Account account;

	public Card(Account account) {

		this.account = account;
	}
	
	class saveMoney implements Runnable {
		@Override
		public void run() {
			synchronized (account) {
				double saved = account.getMoney();
				saved += account.getSave();
				account.setMoney(saved);
				System.out.println(Thread.currentThread().getName() + " 存入 "
						+ account.getName() + " 账户：" + account.getSave() + "元      余额："
						+ saved + "元");

			}

		}
	}

	class getMoney1 implements Runnable {

		@Override
		public void run() {
			
			synchronized (account) {
				double getd = account.getMoney();
				double take = account.getTakeout();
				if (getd <take ) {
					System.out.println(account.getName() + "的账户余额不足！"+Thread.currentThread().getName()+"您取不到人民币。。");
				} else {
					account.setMoney(getd - take);
					System.out.println(Thread.currentThread().getName() + " 在 "
							+ account.getName() + " 的 " + " 账户取 " + take + " 余额为：" + (getd - take));
				}
			}
		}
	}
}
