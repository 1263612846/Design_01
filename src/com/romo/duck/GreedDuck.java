package com.romo.duck;

import com.romo.impl.FlyCan;
import com.romo.impl.QuackCan;

public class GreedDuck extends Duck {

	@Override
	public void display() {
		System.out.println("ÎÒÊÇÂÌÑ¼×Ó£¡");
	}
	
	public GreedDuck() {
		fly = new FlyCan();
		quack = new QuackCan();
	}

}
