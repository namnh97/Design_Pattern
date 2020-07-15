/*
 * Author : AdNovum Informatik AG
 */

package TheStrategyPattern;

import TheStrategyPattern.Fly.FlyNoWay;
import TheStrategyPattern.Quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	public void display() {
		System.out.println("I'm a model duck");
	}

}
