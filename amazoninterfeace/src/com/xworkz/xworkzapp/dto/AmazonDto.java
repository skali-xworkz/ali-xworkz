package com.xworkz.xworkzapp.dto;

public class AmazonDto {
private String movieName;
private String actor;
private String size;
private String rating;
public AmazonDto(String movieName, String actor, String size, String rating) {
	super();
	this.movieName = movieName;
	this.actor = actor;
	this.size = size;
	this.rating = rating;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getActor() {
	return actor;
}
public void setActor(String actor) {
	this.actor = actor;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
}

