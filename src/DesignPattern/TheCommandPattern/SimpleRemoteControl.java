/*
 * Author : AdNovum Informatik AG
 */

package DesignPattern.TheCommandPattern;

public class SimpleRemoteControl {
	Command slot;
	public SimpleRemoteControl() {

	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

}
