package com.xyc.cli.pattern;

/**
 * 关闭命令
 *
 * @author xuYuYu
 * @date 2024-05-17 16:53:50
 */
public class TurnOffCommand implements Command {
	private Driver driver;

	@Override
	public void execute() {
		driver.turnOff();
	}
}
