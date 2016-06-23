package com.romo.duck;

import com.romo.impl.FlyCanNot;
import com.romo.impl.QuackCanNot;

public class FakeDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我是假鸭子。。。");
	}
	
	public FakeDuck() {
		fly = new FlyCanNot();
		quack = new QuackCanNot();
	}
	
	public void swim() {
		System.out.println("就算我是假鸭子，我也会游泳！");
	}

}
