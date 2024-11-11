package project1;

public class Music extends MediaManager{
String id, type, releaseYear, artist, title, globalSales, tracks, duration, genre;	
public Music(String id, String type, String releaseYear, String artist, String title, String globalSales, String tracks, String duration, String genre) {
	    this.id = id;
	    this.type = type;
	    this.releaseYear = releaseYear;
	    this.artist = artist;
	    this.title = title;
	    this.globalSales = globalSales;
	    this.tracks = tracks;
	    this.duration = duration;
	    this.genre = genre;

	}
}
