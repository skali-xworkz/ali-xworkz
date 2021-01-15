class Reverse
{
static String str="majestic";
static  char ch[]=str.toCharArray();

public static void main(String a[])
{
String str1="";	
for(int i=ch.length-1;i>=0;i--)
{
	str1=str1+ch[i];
	
}
System.out.println(str1);
}
}