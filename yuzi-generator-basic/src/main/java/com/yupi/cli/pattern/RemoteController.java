package com.yupi.cli.pattern;

/**
 * 遥控器
 *
 * @author xuYuYu
 * @date 2024-05-17 16:56:46
 */
public class RemoteController {
	private Command command;

	public RemoteController(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 按下按钮
	 */
	public void pressButton() {
		command.execute();
	}
}
