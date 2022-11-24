import java.util.Scanner;

class student
{int total;
    Scanner sc=new Scanner(System.in);
int marks[]=new int[10];
int credit[]=new int[10];

void display()
{
int sumofcredit=0,i;
System.out.println("Enter the name of the student:");
String name= sc.nextLine();  
System.out.println("Enter the usn of the student:");
String usn=sc.nextLine();
System.out.println("Enter the credits for 5 subjects sequentially:");
for(i=0;i<5;i++)
  {
     credit[i]=sc.nextInt();
  }
System.out.println("Enter the marks for 5 subjects sequentially:");
for(i=0;i<5;i++)
  {

marks[i]=sc.nextInt();
  }

for(i=0;i<5;i++)
{

total=total+credit[i];

}

for(i=0;i<5;i++)
{
if(marks[i]==100)
  {
     sumofcredit+=10; 
  }
else
sumofcredit+=((marks[i]/10)+1)*credit[i];

}

System.out.println("the sgpa of student is "+(sumofcredit/total));
System.out.println("name="+name);

}
}


 class Main
{
public static void main(String args[])
{

student st=new student();
st.display();
}
}

