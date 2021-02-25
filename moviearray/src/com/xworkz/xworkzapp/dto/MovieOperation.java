package com.xworkz.xworkzapp.dto;

public class MovieOperation {
	public MovieDTO[] dto;
	public int index;
		public MovieOperation(int size) {
	// TODO Auto-generated constructor stub
	 dto =new MovieDTO[size];
		}
 public void addMovie(MovieDTO dto)
 {
	 this.dto[index]=dto;
	 index++;
 }
 public void getMovie(){
	 for(int i=0;i<dto.length;i++){
 System.out.println(dto[i].getMovieId()+" "+dto[i].getMovieName());
	 }
 }
}
