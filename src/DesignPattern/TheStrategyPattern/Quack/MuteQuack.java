/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheStrategyPattern.Quack;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
