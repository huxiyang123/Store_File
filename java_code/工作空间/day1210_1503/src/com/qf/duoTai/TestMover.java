package com.qf.duoTai;

public class TestMover {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Chinese c = new Chinese();
		Util.useCommon(c);
		Util.useCommon3(c);
		
		IndustryRobot i = new IndustryRobot();
		Util.useCommon(i);
		Util.useCommon2(i);
		
		ManRobot m = new ManRobot();
		Util.useCommon2(m);
		Util.useCommon(m);
		
		Man man = ManFactory.getMan("ch");          //����ģʽ
		Man man1 = ManFactory.getMan("ch");
		System.out.println(man==man1);
		long end = System.currentTimeMillis();
		System.out.println(end-start);			//��ӡ���е�ʱ��
		
	}

}
