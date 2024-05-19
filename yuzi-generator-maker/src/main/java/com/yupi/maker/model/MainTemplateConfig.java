package com.yupi.maker.model;

import lombok.Data;

/**
 * @author: xuYuYu
 * @createTime: 2024/5/16 14:56
 * @Description: TODO 静态生成模版
 */
@Data
public class MainTemplateConfig {

	/**
	 * 作者 填充值
	 */
	private String author = "xuyuyu";
	/**
	 * 输出值
	 */
	private String outputText="输出结果";

	/**
	 * 是否生成循环 开关
	 **/
	private boolean loop;
}
