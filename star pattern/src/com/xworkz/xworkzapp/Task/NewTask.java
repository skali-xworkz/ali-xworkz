package com.xworkz.xworkzapp.Task;

public class NewTask {
	public static void main(String[] args) {
		int i,j,n=5;
		for (i=1;i<=n;i++){
			for (j=1;j<=n;j++){
				if(j==1||i==j||i==n)
				{
					//System.out.print(i+""+j+" ");//1space
					System.out.print("  *");//2space
				}
				else
				{
					System.out.print("    ");//4space
				}	
			}
			System.out.println( );
		}		
	}	
}
/* *                      
 *  *                  
 *      *              
 *          *          
 *  *  *  *  *  */
