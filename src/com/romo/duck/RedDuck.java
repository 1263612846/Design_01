package com.romo.duck;

import com.romo.impl.FlyCan;
import com.romo.impl.QuackCan;

public class RedDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我是红色的！");
	}
	
	public RedDuck() {
		fly = new FlyCan();
		quack = new QuackCan();
	}

}
