/*
 * Author : AdNovum Informatik AG
 */

package TheCommandPattern;

public class LightOnCommand implements Command {
	Light light;
	public lightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

}
