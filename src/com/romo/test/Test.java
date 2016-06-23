package com.romo.test;

import com.romo.duck.Duck;
import com.romo.duck.FakeDuck;
import com.romo.duck.GreedDuck;
import com.romo.duck.RedDuck;

public class Test {

	public static void main(String[] args) {

		Duck d1 = new RedDuck();
		Duck d2 = new GreedDuck();
		Duck d3 = new FakeDuck();

		Duck[] d = { d1, d2, d3 };

		for (Duck dd : d) {
			dd.display();
			dd.swim();
			dd.fly();
			dd.quack();
			System.out.println();
		}

	}

}
