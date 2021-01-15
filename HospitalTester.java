class HospitalTester
{
public static void main(String a[])
{
	HospitalDTO ht=new HospitalDTO();
	System.out.println("****************************");
	ht.setName("Mallya Hospital");
	ht.setAddress("vittal Mallya Road");
	System.out.println(ht.getName()+"\t"+ht.getAddress()+"\t"+HospitalDTO.type);
	System.out.println("****************************");
}
}