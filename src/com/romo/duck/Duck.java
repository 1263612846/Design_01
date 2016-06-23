package com.romo.duck;

import com.romo.interf.Fly;
import com.romo.interf.Quack;

public abstract class Duck {

	protected Fly fly;
	protected Quack quack;

	public abstract void display();

	public void swim() {
		System.out.println("я╪всснс╬");
	}

	public void fly() {
		fly.fly();
	}

	public void quack() {
		quack.quack();
	}

}
