import java.util.Scanner;
class pn
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter lower limit=");
int l=sc.nextInt();
System.out.print("Enter upper limit=");
int n=sc.nextInt();
int i;
int flag=1;
for(i=l;i<n;i++)
for(int j=2;j<n;j++)
{ 
if((i==j)&&(i/j==0))
flag=0;
}
if(flag==0)
System.out.printf("\t%d",i);
}
}
