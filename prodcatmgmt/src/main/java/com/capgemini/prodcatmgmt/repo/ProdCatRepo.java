package com.capgemini.prodcatmgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.prodcatmgmt.entity.ProdCat;

@Repository
public interface ProdCatRepo extends JpaRepository<ProdCat, Integer> {

}
