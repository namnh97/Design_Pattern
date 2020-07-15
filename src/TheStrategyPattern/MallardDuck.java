/*
 * Author : AdNovum Informatik AG
 */

package TheStrategyPattern;

import TheStrategyPattern.Fly.FlyWithWings;
import TheStrategyPattern.Quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {

	}
}
