package project1;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
	    Scanner scnr = new Scanner(System.in);
	    String fileName = scnr.nextLine();
		MediaManager callManager = new MediaManager();
		callManager.collectMedia(fileName);
		
		System.out.println("Total number of products: " + callManager.products);
	}

}
