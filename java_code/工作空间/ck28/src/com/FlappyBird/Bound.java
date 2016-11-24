package com.FlappyBird;

import java.util.Random;

import com.uti.Config;

public class Bound {
	
	private int UPNumber;
	private int DOWNNumber;
	
	private int BoundX;
	private int UboundY;
	private int Ubound_upY;
	private int DboundY;
	private int Dbound_downY;
	
	public Bound(){
		Random random = new Random();
		UPNumber = random.nextInt(14)+1;
		DOWNNumber = Config.BoundNumber - UPNumber;
		BoundX = 382;
		UboundY = 0;
		Ubound_upY = UPNumber * Config.BoundHeight;
		Dbound_downY = Ubound_upY + 222;
		DboundY = Dbound_downY + Config.BoundHeadHeight;
	}

	public int getBoundX() {
		return BoundX;
	}

	public void setBoundX(int boundX) {
		BoundX = boundX;
	}

	public int getUPNumber() {
		return UPNumber;
	}

	public int getDOWNNumber() {
		return DOWNNumber;
	}

	public int getUboundY() {
		return UboundY;
	}

	public int getUbound_upY() {
		return Ubound_upY;
	}

	public int getDboundY() {
		return DboundY;
	}

	public int getDbound_downY() {
		return Dbound_downY;
	}

}
