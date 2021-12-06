package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.ProductEntity;

import com.ojas.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo prod;

	public ProductEntity addProd(ProductEntity product) {
		return prod.save(product);
	}

	public List<ProductEntity> listOfProducts() {
		List<ProductEntity> list = prod.findAll();
		return list;
	}

	public ProductEntity getProductById(int id) {
		return prod.findById(id).get();

	}

	public ProductEntity update(ProductEntity product) {
		return prod.save(product);

	}

	public void delete(int id) {
		prod.deleteById(id);
	}
}
