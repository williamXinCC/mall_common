package com.william.constant;

/**
 * 常量接口
 * @author william
 *
 */
public interface Constant {

	// 类型
	Integer TYPE_ONE = 1;
	Integer TYPE_TWO = 2;

	// 状态
	Integer STATUS_ONE_USE = 1;
	Integer STATUS_TWO_UNUSE = 2;

	// 正则替换空格换行
	String REPLACE = "\\s*|\t|\r|\n";

	String TO_SYSTEM = "/system/";
	String TO_PAGE = "/page/";
	// 验证码
	String CAPTCHA = "CAPTCHA:";

	String Salt_KEY = "william";
	/**
	 * 状态码
	 * 
	 */
	Integer OK = 200;
	Integer ERROR = 400;

	/**
	 * 可以状态
	 */
	Object AVAILABLE_TRUE = 1;
	Object AVAILABLE_FALSE = 2;
	Object AVAILABLE_DELETE = 99;


}
