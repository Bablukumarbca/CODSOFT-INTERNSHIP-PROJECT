package CODSOFT;

import java.util.Scanner;

public class studentgrade
{
	double Total_marks=500.0, Hindi_marks, English_marks, Math_marks, Sciense_marks, Biology_marks,Totalmarks,average;
	String  grade;
	Scanner sc=new Scanner(System.in);
	studentgrade()
	{
		System.out.println("********************* STUDENT GRADE CALCULATOR **********************");
	}
	public void input()
	{
		System.out.println(" Enter marks obdents in 100 for Hindi: ");
		Hindi_marks=sc.nextDouble();
		System.out.println(" Enter marks obdents in 100 for English: ");
		English_marks=sc.nextDouble();
		System.out.println(" Enter marks obdents in 100 for Maths: ");
		Math_marks=sc.nextDouble();
		System.out.println(" Enter marks obdents in 100 for Science: ");
		Sciense_marks=sc.nextDouble();
		System.out.println(" Enter marks obdents in 100 for Biology : ");
		Biology_marks=sc.nextDouble();
	}
	public void function()
	{
		Totalmarks=Hindi_marks + English_marks + Math_marks + Sciense_marks + Biology_marks;
		average=Totalmarks/5;
		if(average<35)
		{
			grade="E";
		}
		else if(average<50 && average>=35)
		{
			grade="D";
		}
		else if(average<70 && average>=50)
		{
			grade="C";
		}
		else if(average<85 && average>=70)
		{
			grade="B";
		}
		else if(average<100 && average>=85)
		{
			grade="A";
		}
	}
	public void display()
	{
		System.out.println("******************* RESULT INFORMATION *******************");
		System.out.println();
		System.out.println(" Total Matks of Mxamination : "+ Total_marks);
		System.out.println(" Total Marks of Student in Exam : "+ Totalmarks);
		System.out.println(" Average of Total Marks : "+ average);
		System.out.println(" Grade of the Student : "+ grade );
		System.out.println();
		System.out.println("***************** RESULT INFORMATION END *****************");
	}
	public static void main(String[] args)
	{
		studentgrade run=new studentgrade();
		run.input();
		run.function();
		run.display();
	}
}
