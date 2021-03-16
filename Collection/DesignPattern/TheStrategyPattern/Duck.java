/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheStrategyPattern;

import DesignPattern.TheStrategyPattern.Fly.FlyBehavior;
import DesignPattern.TheStrategyPattern.Quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("Al ducks float, even decoys!");
	}
}
