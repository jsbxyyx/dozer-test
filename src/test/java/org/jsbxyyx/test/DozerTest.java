package org.jsbxyyx.test;

import java.util.HashMap;
import java.util.Map;

import org.jsbxyyx.util.DozerUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author jsbxyyx
 * 
 */
public class DozerTest {
	
	@Test
	public void testA() throws Exception {
		Map<String, String> mapA = new HashMap<>();
		mapA.put("date", "2018-04-03");
		mapA.put("vNum", "123");
		
		A a = DozerUtil.map(mapA, A.class);
		Assert.assertEquals("123", a.getVNum());
	}
	
	@Test
	public void testA1() throws Exception {
		Map<String, String> mapA1 = new HashMap<>();
		mapA1.put("date", "2018-04-03");
		mapA1.put("vaNum", "123");
		
		A1 a = DozerUtil.map(mapA1, A1.class);
		Assert.assertEquals("123", a.getVaNum());
	}
	

}
