import java.util.Scanner;
class Pattern01
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter row number:");
int row=sc.nextInt();
System.out.println("enter column number:");
int col=sc.nextInt();

for(int i=1;i<=row;i++)
{
for(int j=1;j<=col;j++)
{
System.out.print("*"+" ");
}
System.out.println();
}
}
}