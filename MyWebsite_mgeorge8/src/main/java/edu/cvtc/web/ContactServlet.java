package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class contact
 */
@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<title>Contact</title>\n\t\t<link rel=\"icon\" href=\"/MyWebsite/images/2koredsavatar.png\"/>\n\t\t<link rel=\"stylesheet\" href=\"/MyWebsite/styles/styles.css\" media=\"all\"/>\n\t</head>");
		
		response.getWriter().append("\n\t<body>\n\t\t<div id=\"wrapper\">\n\t\t\t<div id=\"header\">\n\t\t\t\t<img src=\"/MyWebsite/images/2koredsavatar.png\"/>\n\t\t\t\t<h1>Contact</h1>\n\t\t\t\t<nav>\n\t\t\t\t\t<ul>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/home\">Home</a></li>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/about\">About</a></li>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/contact\">Contact</a></li>\n\t\t\t\t\t</ul>\n\t\t\t\t</nav>\n\t\t\t</div>");
		
		response.getWriter().append("\n\t\t\t<p>Contact me using the form below</p>");
		
		response.getWriter().append("\n\t\t\t<form action=\"#\" method=\"get\">\n\t\t\t\t<label for=\"firstName\">First Name:</label>\n\t\t\t\t<input type=\"text\" id=\"firstName\" name=\"first name\"/>\n\t\t\t\t<label for=\"lastName\">Last Name:</label>\n\t\t\t\t<input type=\"text\" id=\"lastName\" name=\"last name\"/>\n\t\t\t\t<label for=\"mail\">E-mail:</label>\n\t\t\t\t<input type=\"e-mail\" id=\"mail\" name=\"e-mail\"/>\n\t\t\t\t<label for=\"messgage\">Message:</label>\n\t\t\t\t<textarea name=\"message\" rows=\"5\" cols=\"50\"></textarea>\n\t\t\t\t<button type=\"submit\">Submit</button>\n\t\t\t</form>");
		
		response.getWriter().append("\n\t\t\t<p>Alternatively, you can reach me at <a id=\"mailTo\" href=\"mailto:mgeorge8@student.cvtc.edu\">my e-mail.</a>");

		response.getWriter().append("\n\t\t\t<footer>\n\t\t\t\t<small>Copyright &copy; 2016 <a id=\"mailTo\" href=\"mailto:mgeorge8@student.cvtc.edu\">Matthew George</a></small>\n\t\t\t</footer>\n\t\t</div>\n\t</body>\n</html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}