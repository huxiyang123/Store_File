/*
java �в�������ʹ��
  ���ࣺ
    1 ���������������ֵ���͵ı����������в���
	+ �� - �� * �� / �� % �� ++ �� --
    2 ��ֵ�������= �� += �� -= �� *= �� /= �� %=
    3 ��ϵ�������> �� < �� >= �� <= �� == �� !=
       ==�Ƚ���������Ƚϻ�����������ֵ�Ƿ���ȣ��Ƚ������������͵����õ�ַ�Ƿ����
    4 �߼�����������ΪBoolean���͵ı��ʽ��boolean���͵�ֵ��
      ! �� & �� | �� ^ �� && �� ||
    5 λ�������& �� | �� ^ �� ~ �� >> �� << �� >>>
    6 �ַ��������������+
*/
public class Operate{
  public static void main(String[ ] args){
    int i = 10; 
    System.out.println(i+12);
    System.out.println("ȡ�ࣺ"+i%3);
    System.out.println(i+++"\n");  //�൱��i=i+1
     int j = i++;
    System.out.println(j);
    System.out.println(i+"\n");  
    
    int m = 10,n = ++m;
    System.out.println(n);
    System.out.println(m+"\n");  //�൱��m=m+1
   
    int a = 10,b = a--;
    System.out.println(b);  //�Ȱѱ�����ֵ�������ʽ���ټ�1
    System.out.println(a+"\n");  //�൱��a=a-1
    
    int k = 10,h = -- k;
    System.out.println(h);  //�ȼ�1���ڰѱ�����ֵ�������ʽ
    System.out.println(k+"\n");  //�൱��k=k-1

    int x = 10,y = 1,z;
    z = (x++)+(++x)+(y--)+(--y);
    System.out.println(x+"\t"+y+"\t"+z);

    int a1 = 10;
    a1 += 3;  
    System.out.println(a1+"\n");  
    
    boolean f = 2>4;
     
    System.out.println(f); 
 
    //boolean flag = (2=4); ����
    Boolean flag = 2==4;
    System.out.println(flag+"\n"); 
    boolean flag1 = (2!=4);
    System.out.println(flag1+"\n");

    int flag2 = a1*=4;
    System.out.println(flag2);

    int flag3 = (a1%=3);
    System.out.println(flag3+"\n");


    }
}