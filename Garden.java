class Garden
{
String name;
String address;
public void stressFree()
{
System.out.println("****************************");	
System.out.println("Gardening is good for your heart.\nGardening reduces stress.\nGardening can improve your hand strength.\nGardening is good for the whole family.\n");
System.out.println("****************************");
}
public static void main(String a[])
{
	Garden gd=new Garden();
	gd.name="Bugle Rock Park";
	gd.address="Basavanagudi";
	System.out.println("*** NAME *** \t \t*** ADDRESS ***");
	System.out.println(gd.name+ "\t \t"+gd.address+"\t");
	gd.healthTips();
}
}