/**
 * Project Name:common-utils
 * File Name:CamelCaseUtilTest.java
 * Package Name:com.cjsc.common.utils.camelCase
 * Date:2017年8月22日下午2:12:06
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.cjsc.common.utils.camelCase;

import org.junit.Test;

/**
 * ClassName:CamelCaseUtilTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月22日 下午2:12:06 <br/>
 * @author   shanyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class CamelCaseUtilTest {

	@Test
	public void testUnderlineToCamelCase() {
		String underlines = "t_client_info";
		System.out.println(CamelCaseUtil.underlineToCamelCase(underlines));
	}
	
	@Test
	public void testCamelCaseToUnderline() {
		String camelCase = "tClientInfo";
		System.out.println(CamelCaseUtil.camelCaseToUnderline(camelCase));
	}

}

