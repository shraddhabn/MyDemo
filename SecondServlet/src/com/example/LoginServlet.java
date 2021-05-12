package com.example;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("LoginServletp")
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID=1L;

 protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
PrintWriter pw=res.getWriter();
String uname=req.getParameter("uname");
String upass=req.getParameter("upass");
if(uname.equalsIgnoreCase("ojas") && upass.equalsIgnoreCase("venkat")) {
pw.println("<h1 style=color:green>Valid User</h1>");
}else {
pw.println("<h1 style=color:green>InValid User</h1>");
}
}
}