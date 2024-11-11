package project1;

public class TV extends MediaManager{
String id, type, title, director, country, releaseYear, rating, numberOfSeasons, description;
	public TV(String id, String type, String title, String director, String country, String releaseYear, String rating, String numberOfSeasons, String description) {
		this.id = id;
		this.type = type;
		this.title = title;
		this.director = director;
		this.country = country;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.numberOfSeasons = numberOfSeasons;
		this.description = description;

	}
}
