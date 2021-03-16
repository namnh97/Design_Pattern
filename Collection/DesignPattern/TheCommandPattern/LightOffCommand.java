
package DesignPattern.TheCommandPattern;

public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand() {

	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
