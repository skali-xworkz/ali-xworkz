class Movie
{
   static String name="RRR";
   static int noOfActors=150;
   static String directorName="S.S.Rajmouli";
   public static void main(String a[])
   {
	String songs="RRRThemeSong";
	String storyLine="Freedom_Fighters";
	System.out.println(name);
	System.out.println(noOfActors);
	entertain(songs,storyLine);// entertain caller method,songs &storyLine  Arguments
	System.out.println("main method ended");
   }
   static void entertain(String songs,String storyLine)// method name & called method & parameters
   {
   System.out.println("entertain method started");
   System.out.println(songs+"\n"+storyLine);
   System.out.println("entertain method ended");
   }
}