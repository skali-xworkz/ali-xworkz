package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.MovieDTO;
import com.xworkz.xworkzapp.dto.MovieOperation;

public class MovieTester {
public static void main(String[] args) {
	MovieOperation mo=new MovieOperation(2);
	
	MovieDTO md=new MovieDTO();
	md.setMovieId(1);
	md.setMovieName("master");
	
	MovieDTO md1=new MovieDTO();
	md1.setMovieId(2);
	md1.setMovieName("KGF");
	
	mo.addMovie(md);
	mo.addMovie(md1);
	
	mo.getMovie();
}
}
