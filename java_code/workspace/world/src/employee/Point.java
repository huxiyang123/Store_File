package employee;
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
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public void distance(Point p){
		double d = (p.x-x)*(p.x-x)+(p.y-y)*(p.y-y)+(p.z-z)*(p.z-z);
		System.out.println("��x1("+p.getX()+","+p.getY()+","+p.getZ()+")���x2("+x+","+y+","+z+")�ľ����ƽ����"+d);
	}
}