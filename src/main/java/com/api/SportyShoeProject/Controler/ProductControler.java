package com.api.SportyShoeProject.Controler;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.SportyShoeProject.Model.ProductModel;
import com.api.SportyShoeProject.Repo.ProductRepo;

@RestController
@RequestMapping("products")
public class ProductControler {
@Autowired
ProductRepo productrepositry;

//retrieve all Product from database
	@GetMapping("all")
	public List<ProductModel> getAll()
	{
		List<ProductModel> Products=(List<ProductModel>) productrepositry.findAll(); 
		return Products;
	}

	//insert new product to database
	@PostMapping("add")
	public ProductModel addProduct(@RequestBody ProductModel Product)
	{
		return productrepositry.save(Product);
	}
	
	// update existing product
	@PutMapping("update/{id}")
	public ProductModel updateProduct(@RequestBody ProductModel Product)
	{
		return productrepositry.save(Product);
	}
	
	// delete particular Product from database
	@DeleteMapping("delete/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		 productrepositry.deleteById(id);
	}
	//Search product by their id
		@GetMapping("product/{id}")
		public Optional< ProductModel>getProductId(@PathVariable int id)
		{
			return productrepositry.findById(id);
		}
		@GetMapping("searchbyseason/{season}")
		public List<ProductModel> searchProductbyseason(@PathVariable String season)
		{
		List<ProductModel> searchByseason = productrepositry.findBySeason(season);
		return searchByseason;

		}
		// search by brand
		@GetMapping("searchbybrand/{brand}")
		public List<ProductModel> searchProductbybrand(@PathVariable String brand)
		{
		List<ProductModel> searchByBrand = productrepositry.findByBrand(brand);
		return searchByBrand;

		}

		//search by category
		@GetMapping("searchbycategory/{Category}")
		public List<ProductModel> searchProductbycategory(@PathVariable String Category)
		{
		List<ProductModel> searchByCategory = productrepositry.findByCategory(Category);
		return searchByCategory;

		}
		
		//search by createdDate
		@GetMapping("searchbydate/{createdDate}")
		public List<ProductModel> searchProductbydate(@PathVariable String createdDate)
		{
		List<ProductModel> searchByDate = productrepositry.findBycreateddate(createdDate);
		return searchByDate;

		}
}
