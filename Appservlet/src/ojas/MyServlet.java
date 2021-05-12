package ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


	public class MyServlet extends GenericServlet {
		private static final long serialVersionUID=1L;

		 @Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>WELCOME</h1>");
		pw.close();
		}
		public void init(ServletConfig config)throws ServletException{
		System.out.println("init method");
		}
		public void destroy() {
		System.out.println("destroy method");
		}

}
