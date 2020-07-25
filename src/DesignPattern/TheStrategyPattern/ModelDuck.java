/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheStrategyPattern;

import DesignPattern.TheStrategyPattern.Fly.FlyNoWay;
import DesignPattern.TheStrategyPattern.Quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	public void display() {
		System.out.println("I'm a model duck");
	}

}
