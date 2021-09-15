package com.hsbc.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/cartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itemName=request.getParameter("itemName");
		String price=request.getParameter("price");
		CartItem item=new CartItem();
		item.setItemName(itemName);
		item.setPrice(price);
		
		HttpSession session=request.getSession(true);
		List<CartItem> itemList=(List<CartItem>)session.getAttribute("cart");
		
		if(itemList==null) {
			 itemList=new ArrayList<>();
			 itemList.add(item);
			 session.setAttribute("cart", itemList);
			
		}else {
			itemList.add(item);
			session.setAttribute("cart", itemList);
			
		}
		
		System.out.println("Cart Items :"+itemList);
		request.getRequestDispatcher("/shoppingPage.jsp").forward(request, response);
	}

}
