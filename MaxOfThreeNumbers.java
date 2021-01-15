class MaxOfThreeNumbers
{
  public static void main(String a[])
{
int num1=34;
int num2=89;
int num3=98;
findMaxValue(num1,num2,num3);
}
 static void findMaxValue(int num1,int num2,int num3)
{
 if(num1>num2 && num1> num3)
{
 System.out.println("the greatest number is:"+ num1);
}
 else if(num2>num3)
{
 System.out.println("the greatest number is:"+ num2);
}
else
{
 System.out.println("the greatest number is:"+ num3);	
}
}
}