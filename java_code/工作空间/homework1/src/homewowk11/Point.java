package homewowk11;
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
	public static void distance(Point p,Point p1){
		double d = (p.x-p1.x)*(p.x-p1.x)+(p.y-p1.y)*(p.y-p1.y)+(p.z-p1.z)*(p.z-p1.z);
		System.out.println("点x1("+p.x+","+p.y+","+p.z+")与点x2("+p1.x+","+p1.y+","+p1.z+")的距离的平方："+d);
	}
}
