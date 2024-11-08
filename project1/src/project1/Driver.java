package project1;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
	   // Scanner scnr = new Scanner(System.in);
	    String fileName = "project1dataset.csv";
	    System.out.println("File name entered");
		MediaManager mediaManager = new MediaManager();
		mediaManager.collectMedia(fileName);
	}

}
