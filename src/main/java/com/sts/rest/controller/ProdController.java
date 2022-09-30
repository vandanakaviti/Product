package com.sts.rest.controller;

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

import com.sts.rest.entity.Product;
import com.sts.rest.service.ProdService;

@RestController
@RequestMapping("/rest")
public class ProdController {
	
	@Autowired
	private ProdService service;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return this.service.getAllProducts();
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		return this.service.addProduct(product);
	}
	
	@DeleteMapping("/deleteProduct/{prodId}")
	public String deleteProduct(@PathVariable String prodId) {
		return this.service.deleteProduct(Integer.parseInt(prodId));
	}
	
	@PutMapping("/updateProduct/{prodId}")
	public String updateProduct(@PathVariable String prodId, @RequestBody Product product) {
		return this.service.updateProduct(Integer.parseInt(prodId), product);
	}
}
