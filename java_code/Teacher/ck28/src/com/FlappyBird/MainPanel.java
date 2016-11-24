package com.FlappyBird;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.uti.Config;

public class MainPanel extends JPanel implements Runnable {

	private static final long serialVersionUID = -6713365370188068644L;
	
	private JLabel jl = null;
	private MyButton button = null;
	
	private BufferedImage background = null;
	private BufferedImage bird[] = new BufferedImage[3];
	private BufferedImage bound = null;
	private BufferedImage bound_up = null;
	private BufferedImage bound_down = null;
	private BufferedImage floor = null;
	private BufferedImage gameover = null;
	private BufferedImage front = null;
	
	private int birdId = 0;
	private int birdX = 61;
	private int birdY = 260;
	
	private int score = 0;
	
	public MainPanel(final MainFrame mf){
		init();
		this.setLayout(null);
		Icon img= new ImageIcon(background);
		jl = new JLabel();
		jl.setBounds(0, 0, Config.WIDTH, Config.HEIGHT);
		jl.setIcon(img);
		
		button.setBorderPainted(false);
		button.setBounds(136, 400, 110, 64);
		button.setVisible(false);
		
		this.add(button);
		this.add(jl);
		this.setSize(Config.WIDTH, Config.WIDTH);
		this.setVisible(true);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				mf.map.remove(button);
//				mf.map.repaint();
//				mf.remove(mf.map);
				BoundList.Blist.clear();
				FloorList.Flist.clear();
//				mf.map = new MainPanel(mf);
//				mf.map.button.setVisible(false);
//				mf.repaint();
//				mf.add(mf.map);
//				new Thread(mf.map).start();
				mf.dispose();
				new MainFrame();
			}
		});
	}
	
	public void init(){
		try {
			BoundList.addLast(new Bound());
			FloorList.addLast(new Floor());
			button = new MyButton();
			background = ImageIO.read(this.getClass().getResource("/com/image/background.png"));
			bound = ImageIO.read(this.getClass().getResource("/com/image/bound.png"));
			bound_up = ImageIO.read(this.getClass().getResource("/com/image/bound_up.png"));
			bound_down = ImageIO.read(this.getClass().getResource("/com/image/bound_down.png"));
			floor = ImageIO.read(this.getClass().getResource("/com/image/floor.png"));
			gameover = ImageIO.read(this.getClass().getResource("/com/image/GameOver.png"));
			front = ImageIO.read(this.getClass().getResource("/com/image/front.png"));
			for(int i=0;i<3;i++){
				bird[i] = ImageIO.read(this.getClass().getResource("/com/image/bird_blue_"+i+".png"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(Config.WIDTH, Config.HEIGHT);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(Bound tem:BoundList.Blist){
			for(int i=0;i<tem.getUPNumber();i++){
				g.drawImage(bound, tem.getBoundX(), i*Config.BoundHeight, null);
			}
			g.drawImage(bound_up, tem.getBoundX(), tem.getUbound_upY(), null);
			g.drawImage(bound_down, tem.getBoundX(), tem.getDbound_downY(), null);
			for(int i=0;i<tem.getDOWNNumber();i++){
				g.drawImage(bound, tem.getBoundX(), tem.getDboundY()+i*Config.BoundHeight, null);
			}
		}
		for(Floor tem:FloorList.Flist){
			g.drawImage(floor, tem.getFloorX(), tem.getFloorY(), null);
		}
		g.drawImage(bird[birdId], birdX, birdY, null);
		
		if(GameOver()){
			g.drawImage(gameover, 91, 150, null);
			g.drawImage(front, 72, 250, null);
			g.setColor(Color.WHITE);
			g.setFont(new Font("",Font.BOLD,30));
			g.drawString(score+"", 250, 330);
//			button.set
			button.setVisible(true);
		}else{
			g.setColor(Color.WHITE);
			g.setFont(new Font("",Font.BOLD,45));
			g.drawString(score+"", 171, 100);
		}
	}
	public void addscore(){
		for(Bound tem:BoundList.Blist){
			if(tem.getBoundX() == (birdX+Config.BirdWidth))
				score++;
		}
	}
	
	public void removeBound(){
		if(BoundList.Blist.get(0).getBoundX() <= -170)
			BoundList.removeHead();
	}
	
	public void addBound(){
		for(Bound tem:BoundList.Blist){
			if(tem.getBoundX() == 142){
				BoundList.addLast(new Bound());
				break;
			}
		}
	}
	
	public void removeFloor(){
		if(FloorList.getHead().getFloorX() < -382)
			FloorList.moveFirst();
	}
	
	public void addFloor(){
		for(Floor tem:FloorList.Flist){
			if(tem.getFloorX() == 0|| tem.getFloorX() == -2){
				FloorList.addLast(new Floor(382));
				break;
			}
		}
	}
	
	public boolean GameOver(){
		boolean bo = false;
		if(birdY <=0||(birdY+Config.BirdHeight) >=(Config.HEIGHT-126)){
			bo = true;
		}
		for(Bound tem:BoundList.Blist){
			if((birdX+Config.BirdWidth)==tem.getBoundX()&&((birdY<=(tem.getUbound_upY()+Config.BoundHeadHeight))||((birdY+Config.BirdHeight)>=tem.getDbound_downY())))
				bo = true;
			if(((birdX+Config.BirdWidth)>tem.getBoundX()&&birdX<=(tem.getBoundX()+Config.BoundWidth))&&((birdY<=(tem.getUbound_upY()+Config.BoundHeadHeight))||((birdY+Config.BirdHeight)>=tem.getDbound_downY())))
				bo = true;
		}
		return bo;
	}

	@Override
	public void run() {
		
		try {
			while(true){
				addBound();
				removeBound();
				addFloor();
				removeFloor();
				addscore();
				if(birdId < 2){
					birdId++;
				}else{
					birdId = 0;
				}
				birdY += 6;
				for(Bound tem:BoundList.Blist){
					tem.setBoundX(tem.getBoundX() - 6);
//					System.out.println(tem.getBoundX());
				}
				for(Floor tem:FloorList.Flist){
					tem.setFloorX(tem.getFloorX() - 6);
				}
				
				this.repaint();
				if(GameOver()){
					return;
				}
				Thread.sleep(40);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int getBirdY() {
		return birdY;
	}

	public void setBirdY(int birdY) {
		this.birdY = birdY;
	}
	
}
