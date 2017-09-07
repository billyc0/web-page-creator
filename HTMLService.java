/**
	Web Page Creator
	@author Billy Chandler
	@version 2017-09-07
	
	Description:
	An application that gives you options to create a custom web page (HTML 
		file)
**/

import java.io.*;

public class HTMLService {

	// String variables for user input
	private String title, text, textColor, bgColor;
	
	// Initialization of the user input variables
	public HTMLService(String _title, String _text, String _textColor, 
		String _bgColor) {
		title = _title;
		text = _text;
		textColor = _textColor;
		bgColor = _bgColor;
	}
	
	// Title setter method
	public void setTitle(String _title) {
		title = _title;
	}
	
	// Title getter method
	public String getTitle() {
		return title;
	}
	
	// Text setter method
	public void setText(String _text) {
		text = _text;
	}
	
	// Text getter method
	public String getText() {
		return text;
	}
	
	// Text color setter method
	public void setTextColor(String _textColor) {
		textColor = _textColor;
	}
	
	// Text color getter method
	public String getTextColor() {
		return textColor;
	}
	
	// Background color setter method
	public void setBGColor(String _bgColor) {
		bgColor = _bgColor;
	}
	
	// Background color getter method
	public String getBGColor() {
		return bgColor;
	}
	
	// Resets user input variables
	public void clear() {
		title = "";
		text = "";
		textColor = "";
		bgColor = "";
	}
	
	// Creates a string for HTML code based on user input
	public String toString() {
		return "<html>\n<head>\n<title>" + title + "</title>\n</head>\n" +
			"<body>\n<style>\nbody { color: " + textColor + "; " +
			"background-color: " + bgColor + "; }\n</style>\n" +
			"<h1 style='text-align:center'>" + title + "</h1>\n" +
			"<img src='www.jpg' alt='WWW' width='350px' />\n" +
			"<p>" + text + "</p>\n<hr>\n" +
			"<p><em>Web page creator Java application by: " +
			"<a href='http://www.billychandler.org' target='_blank'>" +
			"Billy Chandler</a></em></p>\n" +
			"</body>\n</html>";
	}
	
	// Writes a .html file with the text from the '.toString()' method
	public void writeFile(String htmlCode) {
		try {
			FileWriter output = new FileWriter("java-html.html");
			BufferedWriter pointer = new BufferedWriter(output);
			
			pointer.write(htmlCode);
			pointer.close();
		}
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}