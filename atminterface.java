package CODSOFT;
import java.util.*;
class atminterface implements interface1
{
	 
	String name,username,password,accountno;
	float balance=1000000f;
	atminterface()
	{
		System.out.println(" >>>>>>>>>>>>>>>> ATM INTERFACE <<<<<<<<<<<<<<<< \n");
	}
	@Override
	public void register()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(":>:>:>:>:> REGISTER YOUR BANK DETAILS <:<:<:<:<:");
		System.out.println(" Enter the Account holder Name: ");
		this.name=sc.nextLine();
		System.out.println(" Enter the Account Number: ");
		this.accountno=sc.nextLine();
		System.out.println(" Enter the Username: ");
		this.username=sc.nextLine();
		System.out.println(" Enter the Password: ");
		this.password=sc.nextLine();
		
	}
	@Override
	public boolean login()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n:>:>:>:>:> LOGIN YOUR BANK ACCOUNT <:<:<:<:<:\n");
		boolean isLogin = false;
		while(!isLogin)
		{
			System.out.println(" Enter the Username: ");
			String Username=sc.nextLine();
			if(Username.equals(username))
			{
				while(!isLogin) 
				{
					System.out.println(" Enter the Password: ");
					String Password=sc.nextLine();
					if(Password.equals(password))
					{
						System.out.println(" Login Success ");
						isLogin=true;
					}
					else
					{
						System.out.println(" incorrct password ");
					}
				}
			}
			else
			{
				System.out.println(" Username not found ");
			}
		}
		System.out.println("\n:>:>:>:>:> LOGIN FINISED <:<:<:<:<:\n");
		return isLogin;
	}
	@Override
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter balance to deposit: ");
		float amount=sc.nextFloat();
		try
		{
			if(amount<=50000)
			{
				balance += amount;
				System.out.println(" Deposit success");
				String str=amount+"Rs deposit ";
				System.out.println(str);
				System.out.println(" Your bank balance update is :"+ balance);
			}
			else
			{
				System.out.println(" Sorry maximum deposit of 50000 balance ");
			}
		}
		catch(Exception e)
		{
			System.out.println(" Exception is :"+ e);
		}
	}
@Override
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter balance to withdraw: ");
		float amount=sc.nextFloat();
		try
		{
			if(balance>=amount)
			{
				balance -= amount;
				System.out.println(" Withdraw successfully ");
				String str=amount+"Rs withdraw";
				System.out.println(str);
				System.out.println(" Your bank balance update is:"+balance);
			}
			else
			{
				System.out.println(" Insufficient balance ");
			}
		}
		catch(Exception e)
		{
			System.out.println(" Exceptin is: "+ e);
		}
	}
	 @Override
	public void checkBalance()
	{
		System.out.println(" Your bank balance is :"+balance);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		atminterface obj=new atminterface();
		obj.register();
		obj.login();
		
		for(int i=1;i<=4;i++)
		{
			System.out.println("\n SELECT [1] TO DEPOSIT: \n SELECT [2] TO WITHDRAW \n SELECT [3] TO CHECK BALANCE \n SELECT [4] TO EXIT \n");
			System.out.println(" Enter your choise: ");
			int choose=sc.nextInt();
			switch(choose)
			{
			case 1:
				obj.deposit();
				break;
			case 2:
				obj.withdraw();
				break;
			case 3:
				obj.checkBalance();
				break;
			case 4:
				while(choose == 0);
				break;
			}
		}
	}
	
}