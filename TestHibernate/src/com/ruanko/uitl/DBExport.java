package com.ruanko.uitl;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class DBExport {
	
	public static void main(String[] args) {
		//加载Hibernate系统配置文件（hibernate.cfg.xml）
		Configuration cfg= new Configuration().configure();
		SchemaExport export = new SchemaExport(cfg);
		export.create(true, true);
		
	}

}
