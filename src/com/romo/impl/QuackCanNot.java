package com.romo.impl;

import com.romo.interf.Quack;

public class QuackCanNot implements Quack {

	@Override
	public void quack() {
		System.out.println("...");
	}

}
