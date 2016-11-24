package com.FlappyBird;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import com.uti.Config;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -6572995525222073489L;
	
	MainPanel mainPanel = new MainPanel(this);
	
	public MainFrame(){
		super("Flappy Bird");
		this.setSize(Config.WindowWidth,Config.WindowHeight);
		this.setLocation(400, 10);
		
		this.add(mainPanel);
		new Thread(mainPanel).start();
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					mainPanel.setBirdY(mainPanel.getBirdY() - 60);
				}
			}
		});
	}
	
//	public void Replay(){
//		this.remove(map);
//		BoundList.Blist.clear();
//		FloorList.Flist.clear();
//		map = new MainPanel(this);
//		this.repaint();
//		new Thread(map).start();
//		this.add(map);
//	}
	
	public static void main(String[] args) {
		new MainFrame();
	}

}
