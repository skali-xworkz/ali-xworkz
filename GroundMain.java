class GroundMain
{
public static void main(String a[])
{
	GroundDTO gd=new GroundDTO();
	System.out.println("****************************");
	gd.setName("M chinnaswamy Stadium");
	gd.setAddress("Bengaluru");
	System.out.println(gd.getName()+"\t"+gd.getAddress()+GroundDTO.type);
	System.out.println("****************************");
}
}