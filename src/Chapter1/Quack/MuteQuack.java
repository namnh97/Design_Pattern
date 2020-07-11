/*
 * Author : AdNovum Informatik AG
 */

package Chapter1.Quack;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
