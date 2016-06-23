package com.romo.duck;

import com.romo.impl.FlyCanNot;
import com.romo.impl.QuackCanNot;

public class FakeDuck extends Duck {

	@Override
	public void display() {
		System.out.println("���Ǽ�Ѽ�ӡ�����");
	}
	
	public FakeDuck() {
		fly = new FlyCanNot();
		quack = new QuackCanNot();
	}
	
	public void swim() {
		System.out.println("�������Ǽ�Ѽ�ӣ���Ҳ����Ӿ��");
	}

}
