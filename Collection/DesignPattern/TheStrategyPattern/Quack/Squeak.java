/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheStrategyPattern.Quack;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
