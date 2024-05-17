package com.xyc.cli;

import com.xyc.cli.command.ConfigCommand;
import com.xyc.cli.command.GeneratorCommand;
import com.xyc.cli.command.ListCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;

/**
 * 命令执行器
 *
 * @author xuYuYu
 * @date 2024-05-17 17:11:09
 */
@Command(name = "xuzi", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable {
	private final CommandLine commandLine;

	{
		commandLine = new CommandLine(this)
				.addSubcommand(new GeneratorCommand())
				.addSubcommand(new ListCommand())
				.addSubcommand(new ConfigCommand());

	}

	/**
	 * When an object implementing interface <code>Runnable</code> is used
	 * to create a thread, starting the thread causes the object's
	 * <code>run</code> method to be called in that separately executing
	 * thread.
	 * <p>
	 * The general contract of the method <code>run</code> is that it may
	 * take any action whatsoever.
	 *
	 * @see Thread#run()
	 */
	@Override
	public void run() {
		System.out.println("请输入命令 或者 --help 查看帮助命令");
	}

	/**
	 * 执行命令
	 *
	 * @param args 参数
	 * @return {@link Integer }
	 */
	public Integer doExecute(String[] args) {
		return commandLine.execute(args);
	}
}
