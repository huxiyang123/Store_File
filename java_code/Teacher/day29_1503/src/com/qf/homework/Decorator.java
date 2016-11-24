package com.qf.homework;

public abstract class Decorator implements Hamburge{
   private Hamburge ham;
   
   public Decorator(Hamburge ham) {
	 this.ham = ham;
   }
   
   @Override
	public void product() {
       doBefore();
       ham.product();
       doAfter();	
	}
   
    public abstract void doBefore();
    public abstract void doAfter();
}
