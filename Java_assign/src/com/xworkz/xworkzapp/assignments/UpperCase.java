package com.xworkz.xworkzapp.assignments;
import java.util.Scanner;
public class UpperCase {
	   public static void main(String[] args)
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Please enter any string to convert to lowercase: ");
	      String strInput = sc.nextLine();
	      char[] ch = strInput.toCharArray();
	      for(int a = 0; a < ch.length; a++)
	      {
	         if(ch[a] >= 'A' && ch[a] <= 'Z')
	         {
	            ch[a] = (char)((int)ch[a] + 32);
	         }
	      }
	      System.out.println("string in upper case is: ");
	      for(int a = 0; a < ch.length; a++)
	      {
	         System.out.print(ch[a]);
	      }
	      sc.close();
	   }
	}