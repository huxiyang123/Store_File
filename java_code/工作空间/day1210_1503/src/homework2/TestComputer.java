package homework2;

public class TestComputer {
	public static void main(String sdf[]){
		FactoryModel.getProduce("键盘");
		FactoryModel.getProduce("鼠标");
		FactoryModel.getProduce("机箱");
		System.out.println("电脑组件生产完成，请组合！！！！");
	}
}
