package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class about
 */
@WebServlet("/about")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<title>About</title>\n\t\t<link rel=\"icon\" href=\"/MyWebsite/images/2koredsavatar.png\"/>\n\t\t<link rel=\"stylesheet\" href=\"/MyWebsite/styles/styles.css\" media=\"all\"/>\n\t</head>");
		
		response.getWriter().append("\n\t<body>\n\t\t<div id=\"wrapper\">\n\t\t\t<div id=\"header\">\n\t\t\t\t<img src=\"/MyWebsite/images/2koredsavatar.png\"/>\n\t\t\t\t<h1>About</h1>\n\t\t\t\t<nav>\n\t\t\t\t\t<ul>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/home\">Home</a></li>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/about\">About</a></li>\n\t\t\t\t\t\t<li><a href=\"/MyWebsite/contact\">Contact</a></li>\n\t\t\t\t\t</ul>\n\t\t\t\t</nav>\n\t\t\t</div>");
		
		response.getWriter().append("\n\t\t\t<div id=\"about\">\n\t\t\t\t<img src=\"/MyWebsite/images/matthew.jpg\" alt = \"Picture of Matthew\"/>\n\t\t\t\t<p>My name is Matthew George. I am currently 20 years old and living alone while I attend a Chippewa Valley Techncial College for software development. Going into the Information Technology: Software Development program with little to no background was an interesting choice of mine. When I was fourteen years old I ran a few minecraft servers and messed around with HTML, but nothing serious. Regardless, the people I met through this inspiried me to pursue a career involving what I love most; video games! Through coding I can do much more then create or edit video games, but it is in essence the community itself that pulled me into this field. ");
		
		response.getWriter().append("\n\t\t\t\t<p>I am currently looking into an extra semester here at CVTC for a second degree; IT - Mobile Developer due to it only being an additional twelve credits on what I am currently taking.</p>\n\t\t\t\t<p>My favorite hobbies include playing video games; thus the interesting photo as a website banner and website icon. This is actually my steam profile picture! When I'm not gaming with my friends, I also enjoy running and going for bike rides. I was the Track Captain of my High School team when I ran 400m dashes and tripled jumped!</p>\n\t\t\t</div>");
		
		response.getWriter().append("\n\t\t\t<footer>\n\t\t\t\t<small>Copyright &copy; 2016 <a id=\"mailTo\" href=\"mailto:mgeorge8@student.cvtc.edu\">Matthew George</a></small>\n\t\t\t</footer>\n\t\t</div>\n\t</body>\n</html>");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
