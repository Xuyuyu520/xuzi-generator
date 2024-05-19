package com.yupi.model;
import lombok.Data;
/**
 * @author: xuYuYu
 * @Description: 动态模型
 */
@Data
public class DataModel {

	/**
	 * 是否生成循环
	 */
	private boolean loop  = false ;

	/**
	 * 作者注释
	 */
	private String author  = "yupi" ;

	/**
	 * 输出信息
	 */
	private String outputText  = "sum = " ;
}
