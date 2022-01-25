import java.util.Scanner;
class BinS
{
public static void main(String[] args)
{
int n,i,low=0,high,mid,k;
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of Array=");
n=sc.nextInt();
int a[]= new int[n];
System.out.printf("Enter %d elements:-\n",n);
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.print("Enter the Search key=");
k=sc.nextInt();
high=n-1;
while(low>high)
{
mid=(low+high)/2;
if(k==a[mid])
System.out.printf("Element is at %d\n",mid+1);
else if(a[mid]<k)
high=mid-1;
else if(a[mid]>k)
low=mid+1;
else
System.out.print("Not found");
}
}
}
