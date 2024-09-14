package CODSOFT;

import java.util.Scanner;

public class currency_converter 
{
	double inr,usd,euro,nepalrupees,pakistani,ruble;
	currency_converter()
	{
		System.out.println(" >>>>>>>>>>>>>>> WELCOME TO CURRENCY CONVERTER <<<<<<<<<<<<<<< \n");
	}
	public void USD_TO_INR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter doller to convert into Rupees: ");
		usd=sc.nextDouble();
		inr = UsdToInr(usd);
		System.out.println(" Dollar ="+"$"+usd+" Equal to INR ="+"₹"+ inr);
	}
	public void INR_TO_USD()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Rupees to convert into doller: ");
		inr=sc.nextDouble();
		usd = InrToUsd(inr);
		System.out.println(" Rupees ="+"₹"+inr+" Equal to dollar ="+"$"+usd);
	}
	
	
	public void EURO_TO_INR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Euro to convert into Rupees: ");
		euro=sc.nextDouble();
		inr = Euro_To_Inr(euro);
		System.out.println(" Euro ="+"€"+euro+" Equal to INR ="+"₹"+inr);
	}
	public void INR_TO_EURO()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rupees to convert into Euro: ");
		inr=sc.nextDouble();
		euro=InrToEuro(inr);
		System.out.println(" Rupees ="+"₹"+inr+" Equal  to Euro ="+"€"+euro);
	}
	
	
	public void NEPALRUPEES_TO_INR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Nepalese to convert into Rupees: ");
		nepalrupees=sc.nextDouble();
		inr=NprToInr(nepalrupees);
		System.out.println(" NPR ="+"₹"+nepalrupees+" Equal to INR ="+"₹"+ inr);
	}
	public void INR_TO_NEPALRUPEES()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Rupees to convert into Nepalese: ");
		inr=sc.nextDouble();
		nepalrupees=InrToNpr(inr);
		System.out.println(" Rupees ="+"₹"+inr+" Equal to NPR ="+"₹"+ nepalrupees);
	}
	
	
	public void PAKISTANI_TO_INR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Pakiatani to convert into Rupees: ");
		pakistani=sc.nextDouble();
		inr=PakistaniToInr(pakistani);
		System.out.println(" Pakistani ="+"Rs"+pakistani+" Equal to INR ="+"₹"+ inr);
	}
	public void INR_TO_PAKISTANI()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Rupees to convert into Pakistani: ");
		inr=sc.nextDouble();
		pakistani=IntToPakistani(inr);
		System.out.println(" Rupees ="+"₹"+inr+" Equal to Pakistani ="+"Rs"+ pakistani);
	}
	
	
	public void RUBLE_TO_INR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Ruble to convert into Rupees: ");
		ruble=sc.nextDouble();
		inr=RubleToInr(ruble);
		System.out.println(" Ruble ="+"₽"+ruble+" Equal to INR ="+"₹"+ inr);
	}
	public void INR_TO_RUBLE()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Rupees to convert into ruble: ");
		inr=sc.nextDouble();
		ruble=InrToRuble(inr);
		System.out.println(" Rupees ="+"₹"+inr+" Equal to Ruble ="+"₽"+ ruble);
	}
	
	
	
	
	public final double UsdToInr(double usd) 
	{
		
		return usd * 83.98;
	}
	public final double InrToUsd(double inr) 
	{
		
		return inr * 0.012; // change amount
	}
	public final double Euro_To_Inr(double euro)
	{
		return euro * 93.23;
	}
	public final double InrToEuro(double inr)
	{
		return inr * 0.011;
	}
	public final double NprToInr(double nepalrupees)
	{
		return nepalrupees * 0.63;
	}
	public final double InrToNpr(double inr)
	{
		return inr * 1.60;
	}
	public final double PakistaniToInr(double pakistani)
	{
		return pakistani * 0.30;
	}
	public final double IntToPakistani(double inr)
	{
		return inr * 3.32;
	}
	public final double RubleToInr(double ruble)
	{
		return ruble * 0.93;
	}
	public  double InrToRuble(double inr)
	{
		return inr * 1.07;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		currency_converter obj=new currency_converter();
		for(int i=1;i<=11;i++)
		{
			System.out.println(" \n SELECT [1] TO USD TO INR \n SELECT [2] TO INR TO USD \n SELECT [3] TO EURO TO INR \n SELECT [4] TO INR TO EURO");
			System.out.println(" SELECT [5] TO NEPALESS TO INR \n SELECT [6] TO INR TO NEPALESS \n SELECT [7] TO PAKISTANI TO INR \n SELECT [8] TO INR TO PAKISTANI");
			System.out.println(" SELECT [9] TO RUSSIAN TO INR \n SELECT [10] TO INR TO RUSSIAN \n SELECT [11] TO EXIT.\n");
			System.out.println(" Enter your choose:");
			int choose=sc.nextInt();
			switch(choose)
			{
			case 1:
				obj.USD_TO_INR();
				break;
			case 2:
				obj.INR_TO_USD();
				break;
			case 3:
				obj.EURO_TO_INR();
				break;
			case 4:
				obj.INR_TO_EURO();
				break;
			case 5:
				obj.NEPALRUPEES_TO_INR();
				break;
			case 6:
				obj.INR_TO_NEPALRUPEES();
				break;
			case 7:
				obj.PAKISTANI_TO_INR();
				break;
			case 8:
				obj.INR_TO_PAKISTANI();
				break;
			case 9:
				obj.RUBLE_TO_INR();
				break;
			case 10:
				obj.INR_TO_RUBLE();
				break;
			case 11:
				while(choose == 11);
			}
		}
	}
}