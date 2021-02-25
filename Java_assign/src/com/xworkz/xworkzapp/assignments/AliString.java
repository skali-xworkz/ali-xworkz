package com.xworkz.xworkzapp.assignments;

public class AliString {
	public static void main(String[] args) {
		String str ="alialihihi";
		char ch[]=str.toCharArray();
		System.out.println("original Text\n" +str);
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				//if(ch[i]==ch[j]&&(i!=j))
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
	
					
				}
						
			 }
		}
			for(int i=0;i<ch.length;i++){
			 if(ch[i]!=' ')
				 System.out.println("duplicate string is   "+ch[i]);
			 }
	 }
}