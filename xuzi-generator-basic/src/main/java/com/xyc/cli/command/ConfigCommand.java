package com.xyc.cli.command;

import cn.hutool.core.util.ReflectUtil;
import com.xyc.model.MainTemplateConfig;
import picocli.CommandLine;

import java.lang.reflect.Field;

/**
 * config 命令
 *
 * @author xuYuYu
 * @date 2024-05-17 17:43:01
 */
@CommandLine.Command(name = "config", mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable {
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
		Field[] fields = ReflectUtil.getFields(MainTemplateConfig.class);
		for (Field field : fields) {
			System.out.println("字段名称" + field.getName());
			System.out.println("字段类型" + field.getType());
		}
	}
}
