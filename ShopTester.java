class ShopTester
{
public static void main(String a[])
{
	ShopDTO st=new ShopDTO();
	System.out.println("****************************");
	st.setName("Phoenix Marketcity");
	st.setAddress("Bangalore");
	System.out.println(st.getName()+"\t"+st.getAddress());
	System.out.println("****************************");
}
}