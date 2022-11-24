import java.util.Scanner;
import java.lang.Math;
class quadratic
{
double d,val;
void find(double a,double b,double c)
{
if(a==0)
{
System.out.println("a cannot be zero");
return;
}
else 
{
   d=(b*b)-(4*a*c);
}
if(d>0)
{
System.out.println("The roots are real and unique");
System.out.println((-b+Math.sqrt(d))/(2*a)+"\n"+(-b-Math.sqrt(d))/(2*a));
}
else if(d==0)
{
System.out.println("the roots are real and equal");
System.out.println(-b/(2*a));
}
else
{
System.out.println("there is no real root");
double img=Math.sqrt(-d)/(2*a);
double realpart=-b/(2*a);
System.out.println("real part is "+realpart+" imaginary part is "+img);
}
}
}
class Main1
{
public static void main(String args[])
{
quadratic ob1=new quadratic();
System.out.println("enter the value of a,b and c");
Scanner sc=new Scanner(System.in);
double a1=sc.nextDouble();
double b1=sc.nextDouble();
double c1=sc.nextDouble();
ob1.find(a1,b1,c1);
}
}
