package homewowk11;
/*
 * 2  ����һ����Point����������ʾ��ά�ռ��еĵ㣨���������꣩��
      Ҫ�����£�
      A���������ɾ����ض�����ĵ����--->�вι���
      B���ṩ����������������ķ�����
      C���ṩ���Լ���õ������һ�����ƽ���ķ�����
      D����д������֤����������
 */
public class Point {
	private double x,y,z;
	public Point(double x1,double y1,double z1){
		x = x1;
		y = y1;
		z = z1;
	}
	public static void distance(Point p,Point p1){
		double d = (p.x-p1.x)*(p.x-p1.x)+(p.y-p1.y)*(p.y-p1.y)+(p.z-p1.z)*(p.z-p1.z);
		System.out.println("��x1("+p.x+","+p.y+","+p.z+")���x2("+p1.x+","+p1.y+","+p1.z+")�ľ����ƽ����"+d);
	}
}
