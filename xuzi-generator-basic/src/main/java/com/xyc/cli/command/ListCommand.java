package com.xyc.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine;

import java.io.File;
import java.util.List;

/**
 * @author: xuYuYu
 * @createTime: 2024/5/17 17:09
 * @Description: TODO
 */
@CommandLine.Command(name = "list", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable {
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
		String projectPath = System.getProperty("user.dir");
		//整个项目的根目录
		File parentFile = new File(projectPath).getParentFile();
		//输出路径
		String absolutePath = new File(parentFile, "xuzi-generator-demo-projects/acm-template").getAbsolutePath();
		List<File> files = FileUtil.loopFiles(absolutePath);
		for (File file : files) {
			System.out.println(file);
		}
	}
}
