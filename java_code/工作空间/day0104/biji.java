1 内部类 
    1) 成员内部类：
         (1) 可以直接访问外部类的成员成员量，包括私有的。
    	 (2) 外部类访问内部类的成员是，需要new内部类的对象。
	 (3) 在内部类中访问外部类的成员变量 outer.this.变量；
 	 (4) 内部类中有静态成员时，此时内部类也必须是静态的。static是成员修饰符。
    2)静态内部类
	 (1) 当内部类中定义了静态成员，该内部类必须是static的；
	 (2) 当外部类的静态方法访问内部类时，内部类也必须是静态的。
    3)匿名内部类：就是内部类的简写。
        前提：内部类必须继承一个类或是实现接口。
	(1) 一个内部类可以直接集成外部类或外部其他类
	(2) 匿名内部类就是匿名子类对象
	(3) 里面包含的方法最好不要超过3个

在Java语言中，引入了对象互斥锁的概念，保证共享数据操作的完整性。每个对象都对应于一个可称为“互斥锁”的标记，这个标记保证在任一时刻，只能有一个线程访问该对象。关键字synchronized来与对象的互斥锁联系。当某个对象synchronized修饰时(成为了互斥锁)，表明该对象在任一时刻只能由一个线程访问。