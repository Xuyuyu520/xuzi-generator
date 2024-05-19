package com.yupi;

import com.yupi.cli.CommandExecutor;

/**
 * @author: xuYuYu
 * @createTime: 2024/5/17 17:46
 * @Description: TODO
 */
public class Main {
	public static void main(String[] args) {
		// args = new String[] { "generator","-l","-a","-o","-help" };
		CommandExecutor commandExecutor = new CommandExecutor();
		commandExecutor.doExecute(args);
	}
}
