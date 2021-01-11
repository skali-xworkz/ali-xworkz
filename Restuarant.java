class Restuarant
{
String id;
String name;
String address;
public void eat()
{
System.out.println("eating schezvan noodles");
}
public static void main(String a[])
{
	Restuarant rs=new Restuarant();
	rs.id="DERT456";
	rs.name="kadamba";
	rs.address="malleshwaram";
	System.out.println(rs.id+ "\t"+rs.name+"\t"+rs.address);
	rs.eat();
}
}