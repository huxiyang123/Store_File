package com.qf.duoTai;

public class ManFactory {
	public static Man getMan(String type){
		if (type.equals("ch")){
			return new Chinese();
		}
		else if(type.equals("am")){
			return new Amrican();
		}
		else{
			System.out.println("��������������ch��am");
			return null;
		}
	}
}
