package com.cg.inventorymanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.inventorymanagementsystem.dto.ManufacturerBean;
import com.cg.inventorymanagementsystem.dto.ProductBean;

public class SupplierDaoImpl implements SupplierDao{

	@Override
	public List<ManufacturerBean> viewMyOrders() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ManufacturerBean";
		Query query = entityManager.createQuery(jpql);

		List<ManufacturerBean> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;

		
	}

	@Override
	public List<ProductBean> showProducts() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ProductBean";
		Query query = entityManager.createQuery(jpql);

		List<ProductBean> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;

		
	}

}
