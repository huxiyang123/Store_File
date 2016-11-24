package Decorator;
/*
 * 装饰器模式：
 * 	又称为包装模式，就是给对象动态添加一叠额外的功能。
 * 核心步骤：
 * 	1 定义一个装饰器和被装饰类的对象均需要实现接口，在接口定义规则。
 * 	2 定义一个实现步骤1接口的被装饰类
 * 	3 定义一个实现步骤1接口的装饰器抽象类，在抽象类中定义新增的抽象功能方法(在子类中才需要实现)。
 * 	   还需要定义一个接口类型的变量(实际就是被装饰者)(被装饰类的对象或者装饰器实现类的对象均有可能。)
 * 	   然后在构造方法中设置接口类型的参数，等待子类传入。
 * 	   还需要覆盖接口中的方法，在方法体中调用被装饰者的方法前或方法后可以添加定义的抽象方法。
 * 	4实现装饰器的子类
 *  * 优点：  装饰模式是通过把复杂的功能简单化，分散化，然后再运行期间，根据需要来动态组合的这样一个模式。
 * 使用场景：
 *   1 不改变被装饰对象的情况下，动态添加新的功能
 *   2 不适合或无法通过子类扩展功能的时候
 * 备注：装饰者与被装饰者拥有共同的超类，继承的目的是继承类型，而不是行为
 * 
 */
public class TestDecorator {

	public static void main(String[] args) {
		ChickenHamburger  ch = new ChickenHamburger();
//		Hamburger h = new EggDecorator(ch);
//		h.produce();
		Hamburger bd = new BeefDecorator(new EggDecorator(ch));
		bd.produce();

	}

}
