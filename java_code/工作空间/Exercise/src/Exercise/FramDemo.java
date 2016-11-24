package Exercise;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FramDemo {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("ºúÏ²Ñó");
		f.setSize(800, 300);
		f.setLocation(400,100);
		f.setLayout(new FlowLayout());
		Button b = new Button("È·¶¨");
		f.add(b);
		
		//f.setVisible(true);
	}

}
