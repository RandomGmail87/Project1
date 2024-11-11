package project1;

public class Movies extends MediaManager{
	String id, type, title, director, country, releaseYear, rating, duration, description;
	public Movies(String id, String type, String title, String director, String country, String releaseYear, String rating, String duration, String description) {
		this.id = id;
		this.type = type;
		this.title = title;
		this.director = director;
		this.country = country;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.duration = duration;
		this.description = description;
	}
	
}
