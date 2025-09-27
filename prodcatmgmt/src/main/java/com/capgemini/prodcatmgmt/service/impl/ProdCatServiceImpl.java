package com.capgemini.prodcatmgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.prodcatmgmt.entity.ProdCat;
import com.capgemini.prodcatmgmt.repo.ProdCatRepo;
import com.capgemini.prodcatmgmt.service.ProdCatService;

@Service 
public class ProdCatServiceImpl implements ProdCatService {
	
	@Autowired
	ProdCatRepo prodCatRepo;

	@Override
	public void save(ProdCat prodCat) {
		if(prodCat.getId()==0)
		{
			prodCatRepo.save(prodCat);
		}
		else
		{
			ProdCat prdCat= prodCatRepo.findById(prodCat.getId()).get();
			prdCat.setProdCat(prodCat.getProdCat());
			prodCatRepo.save(prdCat);
			
		}

	}
	
//	@Override
//	public void update(ProdCat prodCat) {
//		// TODO Auto-generated method stub
//		ProdCat prdCat= prodCatRepo.findById(prodCat.getId()).get();
//		prdCat.setProdCat(prodCat.getProdCat());
//		prodCatRepo.save(prdCat);
//	}


	@Override
	public List<ProdCat> findAll() {
		// TODO Auto-generated method stub
		return prodCatRepo.findAll();
	}

	@Override
	public ProdCat findById(int id) {
		// TODO Auto-generated method stub
		return prodCatRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		prodCatRepo.deleteById(id);
	}

}
