package com.xyc.cli.pattern;

/**
 * 驱动
 *
 * @author xuYuYu
 * @date 2024-05-17 16:54:01
 */
public class Driver {
	private String name;

	public Driver(String name) {
		this.name = name;
	}

	public void turnOn() {
		System.out.println(name + " is turned on");
	}

	public void turnOff() {
		System.out.println(name + " is turned off");
	}
}
