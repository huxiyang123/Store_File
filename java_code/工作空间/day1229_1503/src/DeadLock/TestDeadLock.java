package DeadLock;
/*
 * ������
 * 	�߳�֮��ֻ�жԷ���Ҫ�����Ҷ������������¶��޷�ִ���Լ��Ĵ���顣
 * ���������
 * 	���ӹ����������ȡ�
 */
public class TestDeadLock {

	public static void main(String[] args) {
		DeadLock dl = new DeadLock("��һ��");
		dl.start();
		DeadLock dlk = new DeadLock("�ڶ���");
		dlk.start();
	}

}
