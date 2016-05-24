package com.willsung.adapter;

public class Notebook {

	private Foreign_Charger plug;
	
	public Notebook(Foreign_Charger plug){
		this.plug = plug;
	}
	
	public void charge(){
		plug.charge_Foreign();
	}
	
	public static void main(String[] args) {
		GB_Charger gbc = new GB_Charger();
		Foreign_Charger fc = new GBAdapter_Combination(gbc);
		Notebook nb = new Notebook(fc);
		System.out.println("笔记本");
		nb.charge();

		fc = new GBAdapter_Extends();
		nb = new Notebook(fc);
		nb.charge();
	}

}
