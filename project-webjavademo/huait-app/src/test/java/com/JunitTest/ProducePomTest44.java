package com.JunitTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProducePomTest44 {
	static WebKeyword3738 web;
	static LoginPage40Pom lp;

	@BeforeAll
	static void BeforeAll() {
		web = new WebKeyword3738();
		web.openBrowser("chrome");
		lp=new LoginPage40Pom(web);

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

//	@Test
//	@Order(2)
//	void test_addcustom() {
//		CustomPage4243 cp = new CustomPage4243(web);
//		String sjmsj=cp.custom_add();
//		Assertions.assertEquals("客戶添加成功1", sjmsj);
//	}

	@Test
	@Order(2)
	void test_addproduct() {
		ProductPage44 pp = new ProductPage44(web);
		String sjmgj = pp.product_add("肥皂客户","恒温","加工食品","100","香香肥皂2","盒");
		Assertions.assertEquals("商品添加成功", sjmgj);
	}

}
