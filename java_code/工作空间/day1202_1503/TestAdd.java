/*
 ����������
   ��Ҫ������
    1
*/

public class TestAdd{
  public static void main(String[] args){
    TestAdd ta = new TestAdd();
    double i = ta.add(3,1.4);
    System.out.println(i);
    int j = ta.add(1,2);
    System.out.println(j);
    double k = ta.add(1.4,2.3);
    System.out.println(k);
    double h = ta.add(1.4,3);
    System.out.println(h);
    int m = ta.add(1,2,3);
    System.out.println(m);
  }
  int add(int a, int b){
    System.out.println(" �����������int");
    return a+b;
  }
  int add(int a, int b,int c){
    System.out.println(" �����������int");
    return a+b;
  }
  double add(double a, double b){
    System.out.println(" �����������double");
    return a+b;
  }
  double add(int a, double b){
    System.out.println(" �����������int��double");
    return a+b;
  }
  double add(double a, int b){
    System.out.println(" �����������double��int��");
    return a+b;
  }
}