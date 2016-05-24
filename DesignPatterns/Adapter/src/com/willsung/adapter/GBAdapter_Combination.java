package com.willsung.adapter;

/*对象适配
 *适配器，将Foreign_Charger适配为GB_Charger
 *通过实现接口+私有成员变量实现适配
*/
public class GBAdapter_Combination implements Foreign_Charger {

	private GB_Charger plug;
	
	public GBAdapter_Combination(GB_Charger plug){
		this.plug = plug;
	}

	@Override
	public void charge_Foreign() {
		System.out.println("通过组合实现适配");
		plug.charge_GB();
	}
}
