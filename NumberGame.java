package CODSOFT;
import java.util.*;
public class numbergame 
{
	int random,attempts,guess,maxattempts,score=0;
	Scanner sc=new Scanner(System.in);
	numbergame()
	{
		maxattempts=5;
		System.out.println("\n :>>>>>>>>>>>>>>>>>>>> WELCOME TO THE NUMBER GAME <<<<<<<<<<<<<<<<<<<: \n");
		System.out.println(" :>>>>>>>>>>>>>>>>>>>> RULES FOR NUMBER GAME <<<<<<<<<<<<<<<<<<<: ");
		System.out.println(" <<<>>> Range of Number is 1 to 100 <<<>>>");
		System.out.println(" <<<>>> Maximum Number of attempts is 5 <<<>>> \n");
		System.out.println(" How to play:\n Computer will guess a random number: ");
		System.out.println(" WINNER : Your choices matche the Computer choices.\n LOSS : Your choices dos not matche computer choices.\n");
	}
	public void function()
	{
		System.out.println(" :>>>>>>>>>> START GAME <<<<<<<<<<: ");
		System.out.println(" Computer has chooes a number ");
		random =1+(int)(100*Math.random());
		
		for(attempts=1;attempts<=maxattempts;attempts++)
		{
			System.out.println(" Attempts "+attempts+ " \n Chooes a number: ");
			guess=sc.nextInt();
			if(guess<1||guess>100)
			{
				System.out.println(" wrong input ");
			}
			else
			{
				if(guess == random)
				{
					System.out.println(" You Winner ");
					score+=1;
					break;
				}
				else if(guess>random && attempts!=maxattempts)
				{
					System.out.println(" You chooes larger number.. ");
				}
				else if(guess<random && attempts!=maxattempts)
				{
					System.out.println(" You chooes small number.. ");
				}
			}
			
		}
		if(attempts-1==maxattempts)
		{
			System.out.println(" you used all attempts: ");
			score-=1;
			System.out.println(" Computer has chooes number is :"+random);
		}	
	}
	
	public static void main(String[] args) 
	{
		int exit,round=0;
		numbergame run=new numbergame();
		do {
			run.function();
			System.out.println(" Round \t"+ round +" \t Score:"+run.score);
			
			System.out.println(" press 0 to exit: ");
			exit=new java.util.Scanner(System.in).nextInt();
			round++;
		}
		while(exit !=0);
		
	}
}
