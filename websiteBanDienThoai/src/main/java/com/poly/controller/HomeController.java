package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	
	
	
	
	
	
	//*******admin**********///
	@RequestMapping("/admin/layout")
	public String index() {
		return "admin/layout";
	}
	
	//trang tổng quan
	@RequestMapping("/admin/home/index-a")
	public String index2() {
		return "admin/home/index-a";
	}
	
	//quản lý admin
	@RequestMapping("/admin/master/index")
	public String admin() {
		return "admin/master/index";
	}
	
	//quản lý khách hàng
	@RequestMapping("/admin/customer/index")
	public String customer() {
		return "admin/customer/index";
	}
	
	//quản lý sản phẩm
	@RequestMapping("/admin/product/index")
	public String listProduct() {
		return "admin/product/index";
	}
		
	//dơn hàng
	@RequestMapping("/admin/order/index")
	public String order() {
		return "admin/order/index";
	}
		
	//quản lý bản tin
	@RequestMapping("/admin/news/index")
	public String category() {
		return "admin/news/index";
	}
	
	

	
}