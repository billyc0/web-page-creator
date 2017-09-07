/**
	Web Page Creator
	@author Billy Chandler
	@version 2017-09-07
	
	Description:
	An application that gives you options to create a custom web page (HTML 
		file)
**/

import java.util.Scanner;

public class HTMLDriver {

	public HTMLDriver() {
	
		// Variables to be used in the application
		String title, text, textColor, bgColor, code;
		
		// Creates a new scanner for user input
		Scanner scan = new Scanner(System.in);
		
		// Printed application title
		System.out.println("\nWeb Page Creator");
		System.out.println("--------------------");
		
		// User input for the page title
		System.out.print("\nEnter your web page's title: ");
		title = scan.nextLine();
		
		// User input for page paragraph text
		System.out.println("\nEnter a paragraph of text: ");
		text = scan.nextLine();
		
		// User input for the page's text color
		System.out.println("\nEnter a text color: ");
		System.out.println("(Complete list at " + 
			"https://www.w3schools.com/colors/colors_names.asp)");
		textColor = scan.nextLine();
		
		// User input for the page's background color
		System.out.println("\nEnter a background color: ");
		System.out.println("(Complete list at " + 
			"https://www.w3schools.com/colors/colors_names.asp)");
		bgColor = scan.nextLine();
		
		// Saves the user input in the service class
		HTMLService html = new HTMLService(title, text, textColor, bgColor);
		
		// Stores a string of HTML code including user input
		code = html.toString();
		
		// Saves a .html file with the data inside the 'code' string
		html.writeFile(code);
		
		// Lets the user know the web page saved
		System.out.println("\nWeb page creation is complete!");
	}
}