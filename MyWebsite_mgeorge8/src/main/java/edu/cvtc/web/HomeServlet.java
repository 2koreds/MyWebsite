package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Wants us to actually use GIT with github (terminal) not the upload github desktop client
		
		response.getWriter().append("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<title>Home</title>\n\t\t<link rel=\"icon\" href=\"/MyWebsite/images/2koredsavatar.png\"/>\n\t\t<link rel=\"stylesheet\" href=\"/MyWebsite/styles/styles.css\" media=\"all\"/>\n\t</head>");
		
		response.getWriter().append("\n\t<body>\n\t\t<div id=\"wrapper\">\n\t\t\t<div id=\"header\">\n\t\t\t\t<img src=\"/MyWebsite/images/2koredsavatar.png\"/>\n\t\t\t\t<h1>Home</h1>\n\t\t\t\t<nav>\n\t\t\t\t\t<ul>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/home\">Home</a></li>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/about\">About</a></li>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/contact\">Contact</a></li>\n\t\t\t\t\t</ul>\n\t\t\t\t</nav>\n\t\t\t</div>");
		
		response.getWriter().append("\n\t\t\t<h3>Welcome to the home page of my personal website.</h3>\n\t\t\t<p>This site will be used to showcase my development skills and experience including works I've done.</p>");
		
		response.getWriter().append("\n\t\t\t<footer>\n\t\t\t\t<small>Copyright &copy; 2016 <a id=\"mailTo\" href=\"mailto:mgeorge8@student.cvtc.edu\">Matthew George</a></small>\n\t\t\t</footer>\n\t\t</div>\n\t</body>\n</html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
