package study;
/*
 * ��ά���飺
 *    	Java��û�ж�ά����ĸ�����Կ���һλ�����е�Ԫ����һά���飻
 * 	������
 *    	��������[][] ��ά��������
 *  ��ʼ����ʽ��
 *  	1 ��̬��ʼ������������[][] ��ά�������� = new  ��������[][]{{һά����},{һά����}......{һά����}};
 *      			���ߣ���������[][] ��ά�������� ={{һά����},{һά����}......{һά����}}��
 *      2 ��̬��ʼ������������[][] ��ά�������� = new  ��������[��ά���鳤��][];
 *      			��ά��������[��ά��������] = new  ��������[��ǰһά���鳤��]��
 *      			���߰�����һά�����ȹ̶���
 *       			��������[][] ��ά�������� = new  ��������[��ǰһά���鳤��]��
 *    	��ֵ��
 *    		��ά��������[һά�����ڶ�ά�����е�����][һλ���������] = ֵ��
 */
public class TwoArray {
	public static void main(String[] args) {
		//��̬��ʼ��
		String[] name1 = {"���ĺ�","��    ��","������"};
		String[] name2 = {"��ϲ��","�к�ӥ","�ź���","��    ��"};
		String[][] name3  ={name1,name2};
		//��̬��ʼ��
		int[][] ages = new int[2][];
		ages[0] = new int[3];
		ages[1] = new int[4];
		ages[0][0] = 16;
		ages[0][1] = 18;
		ages[0][2] = 17;
		
		ages[1][0] = 20;
		ages[1][1] = 22;
		ages[1][2] = 24;
		ages[1][3] = 21;
		for(int i=0;i<ages.length;i++){
			for(int j=0;j<ages[i].length;j++){
				System.out.print(name3[i][j]+":"+ages[i][j]+"  ");
			}
			System.out.println();
		}
		for(int[] a:ages){
			
		}
		//��ά����
		int[][][] num = new int[2][3][2];
		num[0][0][0] = 1;
		num[0][0][1] = 2;
		num[0][1][0] = 3;
		num[0][1][1] = 4;
		num[0][2][0] = 5;
		num[0][2][1] = 6;
		
		num[1][0][0] = 7;
		num[1][0][1] = 8;
		num[1][1][0] = 9;
		num[1][1][1] = 10;
		num[1][2][0] = 11;
		num[1][2][1] = 12;
		for(int x=0;x<num.length;x++){
			for(int y=0;y<num[x].length;y++){
				for(int z=0;z<num[x][y].length;z++){
					System.out.print(num[x][y][z]+"  ");
				}
				System.out.println("=====");
			}
			System.out.println("ssssssdsss");
		}
	}
}