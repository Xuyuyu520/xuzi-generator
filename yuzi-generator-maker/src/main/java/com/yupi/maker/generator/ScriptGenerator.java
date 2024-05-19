package com.yupi.maker.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

/**
 * 脚本生成器
 *
 * @author xuYuYu
 * @date 2024-05-19 12:38:33
 */
public class ScriptGenerator {

	public static void doGenerator(String outputPath, String jarPath) {
		// 非windows环境
		//#!/bin/bash
		// java -jar target/xuzi-generator-basic-1.0-SNAPSHOT-jar-with-dependencies.jar "$@"
		StringBuilder sb = new StringBuilder();
		sb.append("#!/bin/bash ").append("\n");
		sb.append(String.format("java -jar %s \"$@\"", jarPath)).append("\n");
		FileUtil.writeBytes(sb.toString().getBytes(StandardCharsets.UTF_8), outputPath);
		// 添加可执行权限
		Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rwx-rwx-rwx");
		try {
			Files.setPosixFilePermissions(Paths.get(outputPath), posixFilePermissions);
		} catch (IOException e) {

		}
		sb = new StringBuilder();
		// @echo off
		// java -jar target/xuzi-generator-basic-1.0-SNAPSHOT-jar-with-dependencies.jar %*
		sb.append("@echo off ").append("\n");
		sb.append(String.format("java -jar %s %%*", jarPath)).append("\n");
		FileUtil.writeBytes(sb.toString().getBytes(StandardCharsets.UTF_8), outputPath + ".bat");
	}
	public static void main(String[] args) throws IOException {
		String outputPath = System.getProperty("user.dir") + File.separator + "generator";
		doGenerator(outputPath, "");
	}
}
