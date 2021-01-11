class Parks
{
   static String parkName="Nationalpark";
   static int ticketPrice=250;
   public static void main(String a[])
	{'
	System.out.println(parkName);
	System.out.println(ticketPrice);
	entertainAndPeace();// caller
	}
	static void entertainAndPeace()// called method
    {
	 System.out.println("***************************");
	 System.out.println("A NATIONAL PARK is a park in use for conservation purposes,created and protected by national governments.");
	 System.out.println("***************************");
	}
}
	 
	