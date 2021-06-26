package com.xworkz.pizza;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebParam;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.xworkz.pizza.dao.PizzaHutDAO;
import com.xworkz.pizza.dao.PizzaHutDAOImpl;
import com.xworkz.pizza.dto.PizzaHutDTO;
@WebServlet("/pizz")
public class PizzaServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		ServletConfig config=getServletConfig();
//		String name=config.getInitParameter("key");
//		System.out.println(name);
		String PizzaNAME = req.getParameter("PizzaNAME");
		String PizzaLOCATION= req.getParameter("PizzaLOCATION");
		String PizzaPRIZE = req.getParameter("PizzaPRIZE");
		String PizzaIS_AVAILABLE = req.getParameter("PizzaIS_AVAILABLE");
		String PizzaISSIZE = req.getParameter("PizzaISSIZE");
		String PizzaTYPE = req.getParameter("PizzaTYPE");

		PizzaHutDTO pdt=new PizzaHutDTO();
		pdt.setName(PizzaNAME);
		pdt.setLocation(PizzaLOCATION);
		pdt.setPrice(PizzaPRIZE);
		pdt.setIsAvailable(PizzaIS_AVAILABLE);
		pdt.setSize(PizzaISSIZE);
		pdt.setType(PizzaTYPE);
		
		PizzaHutDAO pda=new PizzaHutDAOImpl();
		pda.save(pdt);
		
		List<PizzaHutDTO> allRecords = pda.loadAllPizzaRecords();
		//System.out.println(allRecords);
		
		Iterator<PizzaHutDTO> iterator = allRecords.iterator();
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		writer.print("<html><body bgcolor=orange>" 
		+"<h1 >Pizza List</h1>"+ 
		"<table border=2 ><tr>"
				+ "<th>PizzaID</th>" 
				+ "<th>PizzaNAME</th>" 
				+ "<th>PizzaLOCATION</th>" 
				+ "<th>PizzaPRIZE</th>" 
				+ "<th>PizzaIS_AVAILABLE</th>"
				+ "<th>PizzaISSIZE</th>" 
				+ "<th>PizzaTYPE</th></tr>");
		
		while (iterator.hasNext()) {
			PizzaHutDTO pizzDto = (PizzaHutDTO) iterator.next();
			int id = pizzDto.getPizzaID();
			String PizzaNAME2 = pizzDto.getName();
			String PizzaLOCATION2 = pizzDto.getLocation();
			String PizzaPRIZE2 = pizzDto.getPrice();
			String PizzaIS_AVAILABLE2 = pizzDto.getIsAvailable();
			String PizzaISSIZE2 = pizzDto.getSize();
			String PizzaTYPE2 = pizzDto.getType();
		
			writer.print("<tr><td>" + id + "</td>" 
			+ "<td>" + PizzaNAME2 + "</td>"
			+ "<td>" + PizzaLOCATION2 + "</td>" 
			+ "<td>" + PizzaPRIZE2 + "</td>" 
			+ "<td>" + PizzaIS_AVAILABLE2 + " </td>"
			+"<td>"  +  PizzaISSIZE2 + "</td>" 
			+"<td>"	 + PizzaTYPE2 + "</td></tr>");
		}
			writer.print("</table><body>");
			writer.print("</html>");
			writer.write("thanks for selecting pizza order" +PizzaNAME);
	

	}
}