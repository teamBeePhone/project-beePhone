package com.poly.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.Report;

public interface ReportDAO extends JpaRepository<Report, Serializable>{
	@Query("SELECT new Report(o.category.name, "
			+ " sum(o.unitPrice * o.quantity), "
			+ " sum(o.quantity), "
			+ " min(o.unitPrice), "
			+ " max(o.unitPrice), "
			+ " avg(o.unitPrice)) "
			+ " FROM Product o "
			+ " GROUP BY o.category.name")
	List<Report> inventoryByCategory();

	@Query("SELECT new Report(o.product.category.name, "
			+ " sum(o.unitPrice * o.quantity), "
			+ " sum(o.quantity), "
			+ " min(o.unitPrice), "
			+ " max(o.unitPrice), "
			+ " avg(o.unitPrice)) "
			+ " FROM OrderDetail o "
			+ " GROUP BY o.product.category.name")
	List<Report> revenueByCategory();
	
	@Query("SELECT new Report(o.order.customer.id, "
			+ " sum(o.unitPrice * o.quantity), "
			+ " sum(o.quantity), "
			+ " min(o.unitPrice), "
			+ " max(o.unitPrice), "
			+ " avg(o.unitPrice)) "
			+ " FROM OrderDetail o "
			+ " GROUP BY o.order.customer.id"
			+ " ORDER BY sum(o.unitPrice * o.quantity) DESC")
	List<Report> revenueByCustomer(Pageable pageable);
	
	@Query("SELECT new Report(month(o.order.orderDate), "
			+ " sum(o.unitPrice * o.quantity), "
			+ " sum(o.quantity), "
			+ " min(o.unitPrice), "
			+ " max(o.unitPrice), "
			+ " avg(o.unitPrice)) "
			+ " FROM OrderDetail o "
			+ " GROUP BY month(o.order.orderDate)"
			+ " ORDER BY month(o.order.orderDate)")
	List<Report> revenueByMonth();
}