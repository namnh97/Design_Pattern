/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheStrategyPattern;

import DesignPattern.TheStrategyPattern.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
