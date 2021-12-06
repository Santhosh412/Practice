package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.ProductEntity;

import com.ojas.service.ProductService;

@RestController
@RequestMapping("/rest/product")
public class ProductController {
	@Autowired
	private ProductService prodService;

	@PostMapping("/add")
	public ProductEntity addProd(@RequestBody ProductEntity product) {
		ProductEntity prod = prodService.addProd(product);
		return prod;
	}

	@GetMapping("/list")
	public List<ProductEntity> listOfProducts() {
		List<ProductEntity> list = prodService.listOfProducts();
		return list;
	}

	@GetMapping("/getId/{id}")
	public ProductEntity getProductById(@PathVariable int id) {
		ProductEntity prod = prodService.getProductById(id);
		return prod;
	}
	@PutMapping("/update")
	public ProductEntity update(@RequestBody ProductEntity product) {
		return prodService.update(product);

	}

	@DeleteMapping("/DelId")
	public void delete(int id) {
		prodService.delete(id);

	}

}
