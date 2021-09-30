package com.api.SportyShoeProject.Repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.SportyShoeProject.Model.ProductModel;
//import com.api.SportyShoeProject.Controler.*;
@Repository
@Transactional
public interface ProductRepo extends CrudRepository<ProductModel, Integer> {

	public List<ProductModel> findBySeason(String season);

	public List<ProductModel> findByCategory(String Category);

	public List<ProductModel> findByBrand(String brand);

	public List<ProductModel> findBycreateddate(String createdDate);

}
