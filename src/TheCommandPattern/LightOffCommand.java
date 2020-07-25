/*
 * Author : AdNovum Informatik AG
 */

package TheCommandPattern;

public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand() {

	}

	@Override
	public void execute() {
		light.off();
	}
}
