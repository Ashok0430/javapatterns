import java.util.Scanner;
class Pattern12
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
if(i==1||j==1||i==row||j==col||i==j||i+j==(row+1)||i==(row+1)/2||j==(col+1)/2)
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