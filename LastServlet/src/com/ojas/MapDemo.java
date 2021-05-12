package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MapDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Map<String,String[]> m = request.getParameterMap();
		Set<Entry<String ,String[]>> s =m.entrySet();
		for(Entry<String,String[]> e: s) {
			String Key = e.getKey();
			String ss[] = e.getValue();
			for(String mc: ss) {
				pw.println("<h4 style=color:blue>"+ mc+ "</h4><br>");
			}
		}
	}

}
