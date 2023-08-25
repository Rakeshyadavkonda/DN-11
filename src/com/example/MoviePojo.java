package com.example;

public class MoviePojo {
	private String movieId;
	private String movieName;
	private String MovieActorName;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieActorName() {
		return MovieActorName;
	}

	public void setMovieActorName(String movieActorName) {
		MovieActorName = movieActorName;
	}

	public void displayInfo() {
		System.out.println(movieId);
		System.out.println(movieName);
		System.out.println(MovieActorName);
	}
}
