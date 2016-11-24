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
				System.out.println(Thread.currentThread().getName() + " ���� "
						+ account.getName() + " �˻���" + account.getSave() + "Ԫ      ��"
						+ saved + "Ԫ");

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
					System.out.println(account.getName() + "���˻����㣡"+Thread.currentThread().getName()+"��ȡ��������ҡ���");
				} else {
					account.setMoney(getd - take);
					System.out.println(Thread.currentThread().getName() + " �� "
							+ account.getName() + " �� " + " �˻�ȡ " + take + " ���Ϊ��" + (getd - take));
				}
			}
		}
	}
}
