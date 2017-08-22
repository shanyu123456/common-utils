/**
 * Project Name:common-utils
 * File Name:CamelCaseUtil.java
 * Package Name:com.cjsc.common.utils.camelCase
 * Date:2017年8月22日下午1:50:52
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.cjsc.common.utils.camelCase;
/**
 * ClassName:CamelCaseUtil <br/>
 * Function: 驼峰命名法相关工具<br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月22日 下午1:50:52 <br/>
 * @author   shanyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class CamelCaseUtil {
	
	private final static String UNDERLINE ="_";
	
	/**
	 * 
	 * @Title: underlineToCamelCase
	 * @Description: 将下划线分割的单词转换成驼峰规则的单词
	 * @param underlines
	 * @return 驼峰规则的单词   
	 * @throws
	 */
	public static String underlineToCamelCase(String underlines){
		String[] words=underlines.split(UNDERLINE);
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			String word = words[i].toLowerCase();
			if(i==0){
				builder.append(word);
			}else{
				char c = word.charAt(0);
				builder.append(Character.toUpperCase(c)).append(word.substring(1));
			}
		}
		return builder.toString();
	}
	
	/**
	 * 
	 * @Title: camelCaseToUnderline
	 * @Description: 将驼峰规则的单词转换成下划线格式的单词
	 * @param camelCase 驼峰规则的单词
	 * @return 下划线格式的单词
	 * @throws
	 */
	public static String camelCaseToUnderline(String camelCase){
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < camelCase.length(); i++) {
			char c = camelCase.charAt(i);
			if(Character.isUpperCase(c)){
				builder.append(UNDERLINE);
				builder.append(Character.toLowerCase(c));
			}else{
				builder.append(c);
			}
		}
		return builder.toString();
	}

}

