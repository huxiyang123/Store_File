/*
   �߼�����������ΪBoolean���͵ı��ʽ��boolean���͵�ֵ�� ! �� & �� | �� ^ �� && �� ||
   !  ȡ��
   &  �߼��룬������Ϊtrue�������true��������false
   |  �߼���������Ϊfalse����Ϊfalse������true
   ^  ���   һ��һ��Ϊtrue������true��falseΪfalse
  &&  ��·�룬����һ��Ϊfalse����ڶ��������бȽϣ����Ϊfalse������ʹ��
  ||  ��·�򣬵���һ��Ϊtrue����ڶ������бȽϣ����Ϊtrue������ʹ��
  ��������������ַ������ʹ��
    +������ص�
 
    

*/
public class Operate2{
  public static void main(String[] args){

    //���߼���
    boolean flag = 2>4;
    System.out.println(!flag);
    System.out.println(!true);
    //&�߼���
    boolean flag1 = 2>4;
    boolean flag2 = 4>3;
    System.out.println(flag1&flag2);
    System.out.println(true&true);
    //|�߼���
    
    System.out.println(flag1|flag2);
    System.out.println(true|true);

    System.out.println();
    //^���
    System.out.println(flag1^flag2);
    System.out.println(true^true);
    //&&��|| ��·��  Ч�ʸ���
    System.out.println(flag1&&flag2);
    System.out.println(true&&true);

    // +�����ӷ�
    String s = "boolean";
    //char c = '\t';
    System.out.println(flag1+s+'\t'+s);
   // System.out.println(false+'a'+10+s);
    
  }

}