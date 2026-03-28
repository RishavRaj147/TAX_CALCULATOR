import java.util.Scanner;
class Tax
{
	void caltax()
	{
		Scanner sc=new Scanner(System.in);
		double salary;
		double t=0;
		System.out.println("Enter your salary: ");
		salary=sc.nextInt();
		if(salary<300000)
		{
			System.out.println("No tax !");
		}
		else if(salary>300000 && salary<700000)
		{
			t=(salary/100)*5;
			System.out.println("You have to pay "+t+" rupees");
		}
		else if(salary>700000 && salary<1000000)
		{
			t=(salary/100)*10;
			System.out.println("You have to pay "+t+" rupees");
		}
		else if(salary>1000000 && salary<1200000)
		{
			t=(salary/100)*15;
			System.out.println("You have to pay "+t+" rupees");
		}
		else if(salary>1200000 && salary<1500000)
		{
			t=(salary/100)*20;
			System.out.println("You have to pay "+t+" rupees");
		}
		else if(salary>1500000)
		{
			t=(salary/100)*30;
			System.out.println("You have to pay "+t+" rupees");
		}
		else
		{
			System.out.println("Enter valid Amount!!");
		}
	}
	public static void main(String str[])
	{
		Tax tx=new Tax();
		tx.caltax();
	}
}