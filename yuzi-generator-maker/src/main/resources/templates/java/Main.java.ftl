package ${basePackage};

import ${basePackage}.cli.CommandExecutor;

/**
 * @author: xuYuYu
 * @createTime: 2024/5/17 17:46
 * @Description: TODO
 */
public class Main {
	public static void main(String[] args) {
		CommandExecutor commandExecutor = new CommandExecutor();
		commandExecutor.doExecute(args);
	}
}
