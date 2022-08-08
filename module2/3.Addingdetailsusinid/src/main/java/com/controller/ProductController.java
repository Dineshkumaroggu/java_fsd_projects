package com.controller;


import com.bean.productdetails;
import com.dao.ProductdetailsDao;
import com.service.Productservice;
import com.service.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
@javax.servlet.annotation.WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		RequestDispatcher rd1=request.getRequestDispatcher("index.html");
		PrintWriter out=response.getWriter();
		String Id=request.getParameter("pid");
		int  pid=  Integer.parseInt(Id);
		String pname=request.getParameter("pname");
		float price=Float.parseFloat(request.getParameter("price"));
		productdetails pd=new productdetails();
		pd.setPid(pid);
		pd.setPname(pname);
		pd.setPrice(price);
		Productservice ps=new Productservice();
		String result = ps.storeEmployee(pd);
	    out.println(result);
	    rd1.include(request, response);
	}

}