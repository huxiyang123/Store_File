package employee;
/*
 * 2  定义一个（Point）类用来表示三维空间中的点（有三个坐标）。
      要求如下：
      A。可以生成具有特定坐标的点对象。--->有参构造
      B。提供可以设置三个坐标的方法。
      C。提供可以计算该点距离另一点距离平方的方法。
      D。编写程序验证上述三条。
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
		System.out.println("点x1("+p.getX()+","+p.getY()+","+p.getZ()+")与点x2("+x+","+y+","+z+")的距离的平方："+d);
	}
}
