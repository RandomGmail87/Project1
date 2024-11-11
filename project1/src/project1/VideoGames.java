package project1;

public class VideoGames extends MediaManager{
String id, type, title, platform, releaseYear, genre, publisher, copiesSold;
	public VideoGames(String id, String type, String title, String platform, String releaseYear, String genre, String publisher, String copiesSold) {
		this.id = id;
		this.type = type;
		this.title = title;
		this.platform = platform;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.publisher = publisher;
		this.copiesSold = copiesSold;
		
    }
}