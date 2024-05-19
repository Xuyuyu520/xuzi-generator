package com.yupi.maker.generator;

import java.io.*;

/**
 * jar 生成器
 *
 * @author xuYuYu
 * @date 2024-05-19 11:23:52
 */
public class JarGenerator {

	public static  void doGenerate(String projectDir) throws Exception {
		//调用命令
		String winMavenCommand = "mvn.cmd clean package -DskipTests=true";
		String otherMavenCommand = "mvn clean package -DskipTests=true";
		String mavenCommand = winMavenCommand;

		ProcessBuilder processBuilder = new ProcessBuilder(mavenCommand.split(" "));
		processBuilder.directory(new File(projectDir));

		Process process = processBuilder.start();
		// 读取命令的输出
		InputStream inputStream = process.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		int exitCode = process.waitFor();
		System.out.println("退出码："+ exitCode);
	}

	public static void main(String[] args) throws Exception {
		doGenerate("D:\\workspace\\code\\yuzi-generator\\yuzi-generator-demo-projects\\acm-template-pro");
	}
}
