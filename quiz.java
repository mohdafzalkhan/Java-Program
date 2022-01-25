import java.util.*;
public class quiz
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Mr.khan's Quiz world");
System.out.println("If you wish to play press 1");
int choice=sc.nextInt();
if(choice==1)
{
System.out.println("\n\tFive questions will be asked.\n\t\tAll questions are objective based=");
System.out.println("-----------------------------------------------------------------------------------------------");
System.out.println("What is the capital of India\n\t1.Delhi\n\t 2.Mumbai\n\t3.Kolkata\n\t4.Bharat\nEnter correct option=");
int op=sc.nextInt();
int score=0;
if(op==1)
{
System.out.println("Congratulations!Correct Answer");
score++;
}
else
{
System.out.println("Wrong answer");
}

System.out.println("-----------------------------------------------------------------------------------------------");
System.out.println("Question 2: What is 26+14=?\n\t1.10\n\t2.20\n\t3.40\n\t4.50\nEnter your answer=");
	op=sc.nextInt();
if(op==3)
{
System.out.println("Congratulations!Correct Answer");
score++;
}
else
{
System.out.println("Wrong answer");
}

System.out.println("-----------------------------------------------------------------------------------------------");
System.out.println("Question 3: What is the name of the pen used in touchscreen display?\n\t1.Pen\n\t2.Display Pen\n\t3.Touch Pen\n\t4.Stylus\nEnter your answer=");
	op=sc.nextInt();
if(op==4)
{
System.out.println("Congratulations!Correct Answer");
score++;
}
else
{
System.out.println("Wrong answer");
}

System.out.println("-----------------------------------------------------------------------------------------------");
System.out.println("Question 4: Which city is known as City of Nawabs?\n\t1.Lucknow\n\t2.Banaras\n\t3.Mumbai\n\t4.Delhi\nEnter your answer=");
	op=sc.nextInt();
if(op==1)
{
System.out.println("Congratulations!Correct Answer");
score++;
}
else
{
System.out.println("Wrong answer");
}

System.out.println("-----------------------------------------------------------------------------------------------");
System.out.println("Question 5: Facebook launched date?\n\t1January 2000.\n\t2.December 1998\n\t3.July 2006\n\t4.February 2004.\nEnter your answer=");
	op=sc.nextInt();
if(op==4)
{
System.out.println("Congratulations!Correct Answer");
score++;
}
else
{
System.out.println("Wrong answer");
}
System.out.println("Your score is "+score+ " Out of 5");
if(score==5)
System.out.println("\n\t\tYou have excellent brain.");
else if(score==0)
System.out.println("\n\t\t Don't waste your father's money");
else if(score==1)
System.out.println("\n\t\tEven Animals can score more than you.");
}
}
}