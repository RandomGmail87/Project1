package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

public class MediaManager {
private int movieCount, musicCount, tvShowCount, videoGameCount, products = 0;
 protected ArrayList<String> mediaList = new ArrayList<String>();
	public void collectMedia(String fileName) throws FileNotFoundException {
		
		try{
			System.out.println("collectMedia called");
			System.out.println("File name entered: " + fileName);
			
			File file = new File(fileName);
			Scanner fileScanner = new Scanner (new BufferedReader(new FileReader(file)));
			
			fileScanner.useDelimiter(",");
			while (fileScanner.hasNext()) {
				String read = fileScanner.next().trim();
				
				switch (read) {
				case "Music Album":
					System.out.println("MUSIC FOUND");
					musicCount++;
					products++;
					break;
				case "Video Game":
                    System.out.println("VIDEOGAME FOUND");
                    videoGameCount++;
                    products++;
                    break;
			    case "Movie":
                    System.out.println("MOVIE FOUND");
                    movieCount++;
                    products++;
                    break;
		        case "TV Show":
                    System.out.println("TV SHOW FOUND");
                    tvShowCount++;
                    products++;
                    break;
                }
				
				mediaList.add(read);
			}
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		}
		catch (Exception e) {
			System.out.println("An error occurred while in MediaManager class.");
		}
		
	}
}
