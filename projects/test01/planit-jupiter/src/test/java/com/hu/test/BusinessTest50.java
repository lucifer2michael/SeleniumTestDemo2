package com.hu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//流程用例
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BusinessTest50 {
	static WebKeyword3738 web;
	static LoginPage40Pom lp;
	static CustomPage4243 cp;
	static ProductPage44 pp;
	static CustomProcurementPage4546 cpp;
	static BatchProPage4748 bp;
	static ShipmentPage49 sp;

	@BeforeAll
	static void BeforeAll() {
		web = new WebKeyword3738();
		web.openBrowser("chrome");
		lp = new LoginPage40Pom(web);
		cp = new CustomPage4243(web);
		pp = new ProductPage44(web);
		cpp = new CustomProcurementPage4546(web);
		bp = new BatchProPage4748(web);
		sp = new ShipmentPage49(web);
	}

	@AfterAll
	static void AfterAll() {
		web.halt("3");
		web.closeBrowser();
	}

	// login
	@Test
	@Order(1)
	void test_login() {
		lp.load();
		String sjmsg = lp.login("admin", "11g123","0000");
		Assertions.assertEquals("admin", sjmsg);
	}

	// add customer
	@Test
	@Order(2)
	void test_addcustom() {
		String sjmsj = cp.custom_add("客户","整体计重", "按托盘","美食客户","长沙市天心区","小小");
		Assertions.assertEquals("客戶添加成功1", sjmsj);
	}

	// add product
	@Test
	@Order(3)
	void test_addproduct() {
		String sjmgj = pp.product_add("美食客户", "恒温", "加工食品", "100", "辣条", "包");
		Assertions.assertEquals("商品添加成功", sjmgj);
	}

	// customer add product stock
	@Test
	@Order(4)
	void test_addcusprotom() {
		String sjmgj = cpp.custompro_add("美食客户", "2023-05-10", "辣条");
		Assertions.assertEquals("进货通知添加成功", sjmgj);

	}

	// 批量收货
	@Test
	@Order(5)
	void test_addbatch() {
		String sjmgj = bp.batch_add("辣条", "100", "010401", "100");
		Assertions.assertEquals("批量收货添加成功", sjmgj);
	}

	// 出货成功
	@Test
	@Order(6)
	void test_addship() {
		String sjmgj = sp.shipment_add("美食客户", "2023-05-05", "10", "辣条");
		Assertions.assertEquals("出货成功", sjmgj);
	}
}
