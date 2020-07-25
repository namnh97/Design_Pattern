/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheCommandPattern;

public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand() {

	}

	@Override
	public void execute() {
		light.off();
	}
}
