package com.simplilearn.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {
	
	private long id;
	private String name;
	private BigDecimal price;
	
	public EProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public EProductEntity(int id,String name, BigDecimal price) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "EProductEntity [id=" + id + ", name=" + name + "]";
	}
	
	

}
