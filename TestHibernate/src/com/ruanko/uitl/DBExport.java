package com.ruanko.uitl;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class DBExport {
	
	public static void main(String[] args) {
		//����Hibernateϵͳ�����ļ���hibernate.cfg.xml��
		Configuration cfg= new Configuration().configure();
		SchemaExport export = new SchemaExport(cfg);
		export.create(true, true);
		
	}

}
