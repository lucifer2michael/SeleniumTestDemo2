package com.hu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShipmentPomTest50 {
	static WebKeyword3738 web;
	static LoginPage40Pom lp;

	@BeforeAll
	static void BeforeAll() {
		web = new WebKeyword3738();
		web.openBrowser("chrome");
		lp = new LoginPage40Pom(web);
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
		// BatchProPage4748 bp = new BatchProPage4748(web);
//		CustomProcurementPage4546 cp = new CustomProcurementPage4546(web);
		// String sjmgj = cp.custompro_add();
		// String sjmgj = cp.custompro_add("肥皂客户","2020-05-10","香香肥皂");
		// String sjmgj = bp.batch_add();
		// String sjmgj = bp.batch_add("香香肥皂", "100", "011301","100");
		// Assertions.assertEquals("客户添加成功", sjmgj);
		// Assertions.assertEquals("进货通知添加成功", sjmgj);
		// Assertions.assertEquals("批量收货添加成功", sjmgj);
		ShipmentPage49 sp = new ShipmentPage49(web);
		// String sjmgj = sp.shipment_add();
		String sjmgj = sp.shipment_add("桃桃", "2023-05-05", "10", "淘淘玩具");
		Assertions.assertEquals("出货成功", sjmgj);
	}

}
