package com.api.SportyShoeProject.Controler;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.SportyShoeProject.Model.PurchaseModel;
import com.api.SportyShoeProject.Repo.PurchaseRepo;
@RestController
@RequestMapping("purchase")
public class PurchaseControler {
	@Autowired
	PurchaseRepo purchaserepositry;
	//retrieve all purchase from database
	@GetMapping("all")
	public List<PurchaseModel>getAll()
	{
		List<PurchaseModel> Purchase=(List<PurchaseModel>)
				purchaserepositry.findAll();
		return Purchase;
	}
	// update existing purchase
		@PutMapping("update/{id}")
		public PurchaseModel updateProduct(@RequestBody PurchaseModel Purchase)
		{
			return purchaserepositry.save(Purchase);
		}
		
		// delete particular Purchase from database
		@DeleteMapping("delete/{id}")
		public void deletePurchase(@PathVariable int id)
		{
			 purchaserepositry.deleteById(id);
		}

}
