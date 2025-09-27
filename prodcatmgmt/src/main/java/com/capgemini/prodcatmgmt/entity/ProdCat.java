package com.capgemini.prodcatmgmt.entity;

 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="prod_cat")
public class ProdCat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="prod_cat")
	String prodCat;

	public ProdCat(String prodCat) {
		super();
		this.prodCat = prodCat;
	}
	
	

	public ProdCat(int id, String prodCat) {
		super();
		this.id = id;
		this.prodCat = prodCat;
	}



	public ProdCat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdCat() {
		return prodCat;
	}

	public void setProdCat(String prodCat) {
		this.prodCat = prodCat;
	}

	@Override
	public String toString() {
		return "ProdCat [id=" + id + ", prodCat=" + prodCat + "]";
	}
	
	
	
	

}
