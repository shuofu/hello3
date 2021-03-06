package com.gongpingjia.carplay.controller.server;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.gongpingjia.carplay.controller.BaseTest;

public class ApplyAuthenticationTest extends BaseTest {

	@Test
	public void testApplyAuthentication() throws Exception {
		MvcResult result = mockMvc
				.perform(
						MockMvcRequestBuilders.post("/user/ab3a32e3-c05e-4a40-98ec-6476ef89f05a/authentication?token=d82fbe5a-3f58-4c84-81a4-3d27224e8c53")
								.param("drivingExperience", "3")
								.param("carBrand", "大众")
								.param("carBrandLogo", "http://gongpingjia.qiniudn.com/img/logo/7206452af3747880ddd07398a95b9bdbebbc963e.jpg")
								.param("carModel", "大众cc")
								.param("slug", "dazhong-cc"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().encoding("UTF-8"))
				.andExpect(
						MockMvcResultMatchers.content().contentType(
								"application/json;charset=UTF-8"))
				.andDo(MockMvcResultHandlers.print()).andReturn();
		Assert.assertNull(result.getModelAndView());
	}
}
