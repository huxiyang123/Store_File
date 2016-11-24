package com.FlappyBird;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class MyButton extends JButton {

	private static final long serialVersionUID = 872042987691222290L;
	private BufferedImage button;
	
	public MyButton(){
		super();
		this.setLocale(null);
		this.setSize(110, 64);
		try {
			button = ImageIO.read(this.getClass().getResource("/com/image/button.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(110,64);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(button, 0, 0, null);
	}
	
	

}
