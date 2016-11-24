package day07_1503;
/*
 * static关键字的使用
 * 1 方法中使用：类方法或静态方法 。不能使用this，super,因为通过类名调用时没有new对象。
 *   调用方法：
 *     1）类名.方法(); 推荐使用
 *     2）对象.方法();不建议使用
 *   工具类中经常使用
 * 2 修饰成员变量：是类变量，在类加载时候被初始化一次。只有一份。
 *   调用方法：
 *     1）类名.成员变量名; 推荐使用
 *     2）对象.成员变量名;不建议使用 
 * 3 修饰代码块。
 *    static{
 *      加载类时候仅初始化一次的代码。
 *    }
 *   作用：
 *     初始化静态(static修饰)变量
 *    
*/
public class MathUtil {
   
   public static int add(int x,int y){	   
	   return x+y;
   }
}
