package com.service;
import com.bean.productdetails;
import com.dao.ProductdetailsDao;



public class Productservice {
	ProductdetailsDao ps=new ProductdetailsDao();
	public String storeEmployee(productdetails pd) {
        if(pd.getPrice()<10000) {
            return " Product price must be > 10000";
        }else if(ps.storeProduct(pd)>0) {
            return " Record inserted successfully";
        }else {
            return " Record didn't insert";
        }
    }
	
}