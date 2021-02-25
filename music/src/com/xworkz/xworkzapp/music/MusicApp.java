package com.xworkz.xworkzapp.music;

public class MusicApp {
	private String size;
	private String lang;
	public MusicApp() {
		// TODO Auto-generated constructor stub
	this("17mb","Tamil");
	}
	public MusicApp(String size,String lang) {
		this.lang=lang;
		this.size=size;
		// TODO Auto-generated constructor stub
		System.out.println("MusicApp object is created");
	}
	@Override
public String searchSongs()
{
	System.out.println("searching the songs by artist");
	return null;
}
	@Override
public int searchSongs()
{
	System.out.println("searching the songs by artist");
	return 0;	
}
private void setSize() {
	// TODO Auto-generated method stub
}
private void setLang() {
	// TODO Auto-generated method stub

}
public String getSize() {
	return size;
}
public String getLang() {
	return lang;
}
}