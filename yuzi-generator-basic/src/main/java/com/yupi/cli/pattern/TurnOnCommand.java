package com.yupi.cli.pattern;

/**
 * 打开命令
 *
 * @author xuYuYu
 * @date 2024-05-17 16:53:54
 */
public class TurnOnCommand implements Command{

	private Driver driver;
	@Override
	public void execute() {
		driver.turnOn();
	}
}
