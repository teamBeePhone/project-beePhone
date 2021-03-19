package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poly.entity.AccountEntity;

public interface AccountDAO extends JpaRepository<AccountEntity, Long>{
	@Query("SELECT a FROM AccountEntity a WHERE a.role=:admin")
	List<AccountEntity> findAllByRole(@Param("admin") boolean role);// đưa vào true:admin, false: customer

}
