package com.xworkz.xworkzapp;


import java.util.Date;

import com.xworkz.xworkzapp.music.MusicApp;//qualified name or FQCN(FULLY QUALIFIED CLASS NAME)
import com.xworkz.xworkzapp.music.Spotify;

public class MusicTester {
public static void main(String[] args) {
	//System.out.println(new Date());
	//up casting
	//MusicApp Spotify=new Spotify("12mb","kannada");
	MusicApp Spotify=new Spotify();
	String song=Spotify.searchSongs();
			System.out.println(song);
			System.out.println(Spotify.getLang()+"\t"+Spotify.getSize());;
}
}