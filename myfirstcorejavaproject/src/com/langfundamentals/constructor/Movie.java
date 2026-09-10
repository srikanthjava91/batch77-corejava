package com.langfundamentals.constructor;

public class Movie {

	String director;
	String producer;
	String hero;
	String heroine;
	String name;
	double budget;

	public Movie() {
		System.out.println("No arg constructro called ");
	}

	Movie(Movie m, String hero) {
		this.hero = hero;
		this.director = m.director;
		this.producer = m.producer;
	}

	Movie(String director, String producer) {
		this.director = director;
		this.producer = producer;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Movie m = new Movie();
		m.movieInfo();

		Movie m1 = new Movie("S S Rajamouli", "D V V ");
		m1.movieInfo();

		Movie m2 = new Movie(m1, "Mahesh Babu");
		m2.movieInfo();
	}

	void movieInfo() {
		System.out.println("Director of the Movie : " + director);
		System.out.println("producer of the Movie : " + producer);
		System.out.println("Hero of the Movie : " + hero);
		System.out.println("heroine of the Movie : " + heroine);
		System.out.println("Name of the Movie : " + name);
		System.out.println("BUdget of the Movie : " + budget);
		System.out.println("*************************************");
	}

}
