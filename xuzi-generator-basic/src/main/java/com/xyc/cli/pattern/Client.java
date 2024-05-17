package com.xyc.cli.pattern;

/**
 * 客户
 *
 * @author xuYuYu
 * @date 2024-05-17 17:02:28
 */
public class Client {
	public static void main(String[] args) {
		Driver driver = new Driver("dd");
		driver.turnOff();
		driver.turnOn();

	}
}
