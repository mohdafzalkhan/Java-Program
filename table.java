import java.util.Scanner;
class table
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number to get table for that number=");
int a=sc.nextInt();
System.out.println("Enter the number till that number table will be shown=");
int n=sc.nextInt();
int i;
System.out.println("Table is:-");
for(i=1;i<=n;i++)
System.out.println("\n"+a+"X"+i+"="+a*i);
}
}