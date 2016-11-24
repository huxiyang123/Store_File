package study;
/*
 * String
 * 	特点：
 * 		1   是final类，不能被继承。
 * 		2   一旦被创建，自古穿的字面值不可改变。
 *  	3 字符串字面值是一个String对象，被存放在字符串常量child的内存区，而且不能重复
 *  	4 创建字符串对象那时，首先会去常量池中查找，是否有重复的字面值对象，没有的情况下就会创建
 *  	5  当“=” 右边有变量或new一个对象时，也会在对象区创建一个对象。
 * 	字符串缓冲池（常量池）：
 * 		
 */
public class TestString {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = "abc";				//直接把“abc”对象的地址付给s2
		System.out.println(s1==s2);
		//利用equals比较s1与s2内容是否相等
		System.out.println("s1与s2内容相等"+s1.equals(s2));
		
		String s3 = "ab"+"c";
		System.out.println("=========");
		System.out.println(s2==s3);
		String s5 = s3+5;
		String s4 = new String(s3+5);
		System.out.println(s4==s5);
		/*
		 * charAt(int index):返回指定索引出的char值
		 * compareTo(String otherStr):
		 * concat(String str):
		 * 
		 */
		System.out.println("========下午");
		String str = "abc";		
		int len1 = str.length();
		int len2 = "abc".length();
		System.out.println(len1+","+len2);
		System.out.println("char a index:"+str.charAt(2));
		System.out.println(str.charAt(1));
		System.out.println(str.codePointAt(2)+"   ............");
		
		int str1 = str.compareTo("afb");
				System.out.println(str1+"    ----------");
				System.out.println(str.compareTo("ab"));
		System.out.println("abd".concat(str));
				System.out.println("abc".contains("ab"));
				
		System.out.println("abc".equals(str));
		System.out.println("abc".equalsIgnoreCase("Abc"));
		byte[] bs = "abc".getBytes();
		for(byte b:bs){
			System.out.print(b+"  ");
		}
		System.out.println("================");
		System.out.println("abcdefg".indexOf('a'));
		System.out.println("abcdefg".indexOf("cde"));
		
		int lastIndex = "abcdabdcd".lastIndexOf('d');//最后一次出现的索引
		System.out.println(lastIndex);
		
		String[] result = "宋江,武松,林冲,晁盖,李逵,华荣,吴用,柴进,史进,朱横".split(",");
		for(String  g:result){
			System.out.print(g+" ");
		}
		System.out.println("abcdabdcd".substring(4, 7));
	}

}
