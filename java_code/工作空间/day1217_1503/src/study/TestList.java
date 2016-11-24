package study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * 泛型：在定义一个集合时就指定集合存储的对象的数据类型.必须是引用数据类型
 * 语法：集合类型<数据类型>
 *   特点：
 *     1 保存时候只能保存指定数据类型的数据
 *     2 取出数据时候，不需要强制类型转换。
 * 分类：（了解）
 *   1 类中声明：可以看做数据类型的占位符。类<泛型声明...>。泛型声明一般使用大写英文字母，多个声明使用逗号隔开。
 *   2 方法中声明：
 *    泛型方法：
 *    [修饰符] T   方法名(泛型类型  参数){ //T是泛型声明
 *      return T类型变量；
 *    } 
 * Iterator接口：Collection系列中一种获取集合元素的迭代器对象。
 *   方法：
 *     1 next():返回迭代的下一个元素
 *     2 hasNext():判断下一个元素是否存在，存在返回true,否则false
 *     3 remove():移除指针左侧的元素，必须保证左侧的元素存在，否则出现异常。
 *     
 */
public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add(0, "world");
		list.add("ni");
		list.add("hao");
		list.add("hao");
		list.add(null);
//		list.add(new User());
//		list.add(1);      
       		
		for (int i = 0; i < list.size(); i++) {			
			System.out.println(list.get(i));
		}
		System.out.println("=========");
		for (String o : list) {			
			System.out.println(o);
		}
		System.out.println("=========");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			it.next();
			it.remove();
		}
        System.out.println(list.size());
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);// 自动装箱 new Integer(1);
		list2.add(2);
		list2.add(3);

		for (int i : list2) {//自动拆箱：new Integer(1).intValue();			
			System.out.println(i);
		}
		
//		List<User> uList = new ArrayList<User>();
//        uList.add(new User());
//        //uList.add("afas");
//        for(User u : uList){
//        	System.out.println(u);
//        }
	}

}

