/*
 * Author : AdNovum Informatik AG
 */

package Chapter1;

import Chapter1.Fly.FlyBehavior;
import Chapter1.Fly.FlyWithWings;
import Chapter1.Quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {

	}
}
