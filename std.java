import java.util.Scanner;
class std
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name=");
        String name=sc.nextLine();
        System.out.print("Enter the Department=");
        String Dept=sc.nextLine();
        System.out.print("Enter the mobile number=");
        String mob=sc.nextLine();
        System.out.printf("Student details:-\nName:-%s\nDepartment:-%s\nMobile:-%s",name,Dept,mob);

    };
};
