/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheStrategyPattern;

import DesignPattern.TheStrategyPattern.Fly.FlyWithWings;
import DesignPattern.TheStrategyPattern.Quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {

	}
}
