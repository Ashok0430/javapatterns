import java.util.Scanner;
class Pattern20
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
if(i==row||j==col||i+j==row+1)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}