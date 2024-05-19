package com.yupi.maker.generator.file;

import com.yupi.maker.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
 */
public class FileGenerator {

	/**
	 * 生成
	 *
	 * @param model 数据模型
	 * @throws TemplateException
	 * @throws IOException
	 */
	public static void doGenerate(Object model) throws TemplateException, IOException {
		String projectPath = System.getProperty("user.dir");

		// 输入路径
		String inputPath = projectPath + File.separator + "xuzi-generator-demo-projects" + File.separator + "acm-template";

		String outputPath = projectPath;
		// 生成静态文件
		StaticFileGenerator.copyFileByHutool(inputPath, outputPath);
		// 生成动态文件
		String inputDynamicFilePath = projectPath + File.separator + "xuzi-generator-basic" +File.separator+ "src/main/resources/templates/MainTemplate.java.ftl";
		String outputDynamicFilePath = outputPath + File.separator + "acm-template/src/com/yupi/acm/MainTemplate.java";
		DynamicFileGenerator.doGenerate(inputDynamicFilePath, outputDynamicFilePath, model);
	}

	public static void main(String[] args) throws TemplateException, IOException {
		MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
		mainTemplateConfig.setAuthor("yupi");
		mainTemplateConfig.setLoop(false);
		mainTemplateConfig.setOutputText("求和结果：");
		doGenerate(mainTemplateConfig);
	}

}
