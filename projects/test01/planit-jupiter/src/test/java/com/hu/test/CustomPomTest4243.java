package com.hu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomPomTest4243 {
	static WebKeyword3738 web;
	static LoginPage40Pom lp;

	@BeforeAll
	static void BeforeAll() {
		web = new WebKeyword3738();
		web.openBrowser("chrome");

	}

	@AfterAll
	static void AfterAll() {
		web.halt("3");
		web.closeBrowser();
	}

	@Test
	@Order(1)
	void test_login() {

		lp.load();
		String sjmsg = lp.login();
		Assertions.assertEquals("admin", sjmsg);
	}

	@Test
	@Order(2)
	void test_addcustom() {
		CustomPage4243 cp = new CustomPage4243(web);
		String sjmsj=cp.custom_add();
		Assertions.assertEquals("客戶添加成功1", sjmsj);
	}

}
