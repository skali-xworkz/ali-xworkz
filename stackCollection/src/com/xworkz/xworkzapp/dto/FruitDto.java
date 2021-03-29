package com.xworkz.xworkzapp.dto;

public class FruitDto {
private String  fruitName;
private String Color;
private int price;
public String getFruitName() {
	return fruitName;
}
public void setFruitName(String fruitName) {
	this.fruitName = fruitName;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public FruitDto(String fruitName, String color, int price) {
	super();
	this.fruitName = fruitName;
	Color = color;
	this.price = price;
}
}
