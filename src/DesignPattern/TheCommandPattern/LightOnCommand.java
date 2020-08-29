
package DesignPattern.TheCommandPattern;

public class LightOnCommand implements Command {
	Light light;
	public lightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
