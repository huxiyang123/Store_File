package exercise;

public class TestPrinter {
	//ע��0����HPPrinter  1����CanonPrinter
	public static void main(String[] args) {
		Factory fact = ToolPrinter.method(1);
		
		fact.open();
		fact.end();
		
	}

}
