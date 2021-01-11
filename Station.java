class Station
{
static String address="majestic";
static String platforms[]={"platforms 1","platforms 2","platforms 3","platforms 4"};
public static void main(String a[])
{
	System.out.println(address);
	System.out.println(platforms.length);
	getplatforms();
}
public static void getplatforms()
{
	for(int i=0;i<platforms.length;i++)
	{
	System.out.println(platforms[i]);
	}
}
}