package com.sts.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.rest.entity.Product;
import com.sts.rest.repository.ProdRepository;

@Service
public class ProdService {
	@Autowired
	private ProdRepository repo;
	
	public List<Product> getAllProducts(){
		List<Product> list = new ArrayList<>();
		this.repo.findAll().forEach(list :: add);
		return list;
	}
	
	public String addProduct(Product product) {
		this.repo.save(product);
		return product.toString() + " added";
	}
	
	public String deleteProduct(int prodId) {
		this.repo.deleteById(prodId);
		return prodId + " has been deleted";
	}
	
	public String updateProduct(Integer prodId, Product product) {
		this.repo.save(product);
		return "Product " + prodId + " has been updated to " + product.toString();
	}
}
