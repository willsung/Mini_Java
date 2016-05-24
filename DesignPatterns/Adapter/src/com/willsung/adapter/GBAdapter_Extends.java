package com.willsung.adapter;

/*
 *类适配
 * 通过继承和实现接口，实现适配器
 */
public class GBAdapter_Extends extends GB_Charger implements Foreign_Charger {

	@Override
	public void charge_Foreign() {
		// TODO Auto-generated method stub
		System.out.println("通过继承实现适配");
		this.charge_GB();
	}

}
