/*
 * Author : AdNovum Informatik AG
 */

package Chapter1;

import Chapter1.Fly.FlyNoWay;
import Chapter1.Quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	public void display() {
		System.out.println("I'm a model duck");
	}

}
