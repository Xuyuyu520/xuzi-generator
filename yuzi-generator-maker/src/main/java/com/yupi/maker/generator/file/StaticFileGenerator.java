package com.yupi.maker.generator.file;

import cn.hutool.core.io.FileUtil;

/**
 * @author: xuYuYu
 * @createTime: 2024/5/15 16:20
 * @Description: TODO
 */
public class StaticFileGenerator {


	/**
	 * 复制文件 通过hutool工具类
	 *
	 * @param inputPath  输入路径
	 * @param outPutPath 输出路径
	 */
	public static void copyFileByHutool(String inputPath, String outPutPath) {
		FileUtil.copy(inputPath, outPutPath, false);
	}

}


