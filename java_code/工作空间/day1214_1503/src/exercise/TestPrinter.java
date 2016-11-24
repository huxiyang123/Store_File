package exercise;

public class TestPrinter {
	//注：0代表HPPrinter  1代表CanonPrinter
	public static void main(String[] args) {
		Factory fact = ToolPrinter.method(1);
		
		fact.open();
		fact.end();
		
	}

}
