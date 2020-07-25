/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheStrategyPattern.Fly;

public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying");
	}
}
