package com.capgemini.prodcatmgmt.service;

import java.util.List;

import com.capgemini.prodcatmgmt.entity.ProdCat;

public interface ProdCatService {
	
	void save(ProdCat prodCat);
	List<ProdCat> findAll();
	ProdCat findById(int id);
	void deleteById(int id);
	//void update(ProdCat prodCat);

}
