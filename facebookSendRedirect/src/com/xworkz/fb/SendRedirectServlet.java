package com.xworkz.fb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/searcher")
public class SendRedirectServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		resp.sendRedirect("https://www.facebook.com/");
	}
}