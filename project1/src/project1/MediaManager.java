package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

public class MediaManager {
protected int movieCount, musicCount, tvShowCount, videoGameCount, products = 0;
protected String id, type, title, releaseYear, genre, publisher, copiesSold, artist, globalSales, tracks, duration, platform, director, country, rating, numberOfSeasons, description;
 protected ArrayList<String> mediaList = new ArrayList<String>();
	public void collectMedia(String fileName) throws FileNotFoundException {
		try{
			
			File file = new File(fileName);
			Scanner fileScanner = new Scanner (new BufferedReader(new FileReader(file)));
			
			fileScanner.useDelimiter(",\\s*");
			while (fileScanner.hasNextLine()) {	
				String line = fileScanner.nextLine();
			    String[] tokens = line.split(",");
			    if (tokens.length > 1) {
			        id = tokens[0];
			        type = tokens[1];
			        switch (type) {
			            case "Music Album":
			                releaseYear = tokens[2];
			                artist = tokens[3];
			                title = tokens[4];
			                globalSales = tokens[5];
			                tracks = tokens[6];
			                duration = tokens[7];
			                genre = tokens[8];
			                MediaManager music = new Music(id, type, releaseYear, artist, title, globalSales, tracks, duration, genre);
			                musicCount++;
			                products++;
			                break;
			                case "Movie":
			                releaseYear = tokens[2];
			                director = tokens[3];
			                country = tokens[4];
			                title = tokens[5];
			                rating = tokens[6];
			                duration = tokens[7];
			                description = tokens[8];
			                MediaManager movie = new Movies(id, type, title, director, country, releaseYear, rating, duration, description);
			                movieCount++;
			                products++;
			                break;
			                case "TV Show":
			                title = tokens[2];
			                director = tokens[3];
			                country = tokens[4];
			                releaseYear = tokens[5];
			                rating = tokens[6];
			                numberOfSeasons = tokens[7];
			                description = tokens[8];
			                MediaManager tvShow = new TV(id, type, title, director, country, releaseYear, rating, duration, description);
			                tvShowCount++;
			                products++;
			                break;
			                case "Video Game":
			                title = tokens[2];
			                genre = tokens[3];
			                platform = tokens[4];
			                publisher = tokens[5];
			                releaseYear = tokens[6];
			                copiesSold = tokens[7];
			                MediaManager videoGame = new VideoGames(id, type, title, platform, releaseYear, genre, publisher, copiesSold);
			                videoGameCount++;
			                products++;
			                break;
			        }
				
			}
			}
			fileScanner.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
		}
		catch (Exception e) {
			System.out.println("An error occurred while in MediaManager class.");
		}
		
	}
	
}
