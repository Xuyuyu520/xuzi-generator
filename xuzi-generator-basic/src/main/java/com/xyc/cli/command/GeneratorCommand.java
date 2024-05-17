package com.xyc.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.xyc.generator.MainGenerator;
import com.xyc.model.MainTemplateConfig;
import lombok.Data;
import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * generator 命令
 *
 * @author xuYuYu
 * @date 2024-05-17 17:34:35
 */
@Data
@CommandLine.Command(name = "generator", mixinStandardHelpOptions = true)
public class GeneratorCommand implements Callable {
	/**
	 * 作者 填充值
	 */
	@CommandLine.Option(names = {"-a", "--author"}, description = "作者", arity = "0..1", interactive = true, prompt = "请输入作者：")
	private String author = "xuyuyu";
	/**
	 * 输出值
	 */
	@CommandLine.Option(names = {"-o", "--outputText"}, description = "输出文本", arity = "0..1", interactive = true, prompt = "请输入文本：")
	private String outputText = "输出结果";

	/**
	 * 是否生成循环 开关
	 **/
	@CommandLine.Option(names = {"-l", "--loop"}, description = "是否循环", arity = "0..1", interactive = true, prompt = "是否确认循环：")
	private boolean loop;

	/**
	 * Computes a result, or throws an exception if unable to do so.
	 *
	 * @return computed result
	 * @throws Exception if unable to compute a result
	 */
	@Override
	public Object call() throws Exception {
		MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
		BeanUtil.copyProperties(this, mainTemplateConfig);

		MainGenerator.doGenerate(mainTemplateConfig);

		return 0;
	}
}
