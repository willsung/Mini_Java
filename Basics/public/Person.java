package com.willsuny;

//���Ա��ⲿ��̳в����õĻ���������Ϊpublic���ͣ������ࡢ��Ա��������Ա������
//������Ϊpublic�Ļ����ڱ���ʱ����ʾ��Person��com.willsuny�в��ǹ����ġ���
public class Person{

	//�����Person�����ǹ��캯��������Ҫ�������þͿ���ʵ�֡�
	public Person(){
		System.out.println("Person���еĺ���");
	}

	public String name;
	public int age;
	
	public void introduce(){
		System.out.println("������" + name + "\n���䣺" + age);
	}
	
}