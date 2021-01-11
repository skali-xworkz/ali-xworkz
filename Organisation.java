class Organisation
{
	String name;
	String address;
public void teamWork()
{
	System.out.println("****************************");
	System.out.println("The company's hardware products include the iPhone smartphone,\nthe iPad tablet computer,the Mac personal computer, the iPod portable media player,\nthe Apple Watch smartwatch, the Apple TV digital media player,\nthe AirPods wireless earbuds and the HomePod smart speaker line.\n");
	System.out.println("****************************");
}
public static void main(String a[])
{
	Organisation os=new Organisation();
	os.name="APPLE";
	os.address=" California";
	System.out.println("***\tNAME*** \t \t*** ADDRESS ***");
	System.out.println("\t"+os.name+ "\t \t\t"+os.address+"\t");
	os.teamWork();
}
}