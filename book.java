/*  Create a class Book which contains four members: name, author, price, num_pages.
 Include a constructor to set the values for the members. 
Include methods to set and get the details of the objects. 
Include a toString( ) method that could display the complete details of the book.
 Develop a Java program to create n book objects.*/



import java.util.Scanner;
 class books {
int k,l;
String name,author;
Scanner sc=new Scanner(System.in);
int price;
int numpages;


books()
{
price=0;
numpages=0;
}

void get()
{
System.out.println("Enter the name of the book:");
name=sc.nextLine();
System.out.println("Enter the name of the author:");
author=sc.nextLine();
System.out.println("Enter the price of the book:");
price=sc.nextInt();
System.out.println("Enter the no of pages of the book:");
numpages=sc.nextInt();

}

public String toString()
{

return name+"\n"+author + "\n"+price+"\n"+numpages+"\n";


/*System.out.println(" name of the boook:");
System.out.println(name);
System.out.println(" name of the author:");
System.out.println(author);
System.out.println("price of book:");
System.out.println(price);
System.out.println("pages of book");
System.out.println(numpages);*/
}
}

class book
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
int i,n;
System.out.println(" enter number of books:");
n=sc.nextInt();
books[] arr=new books[n];
books ident=new books();
for(i=0;i<n;i++) {
arr[i]=new books();
arr[i].get();
}
for(i=0;i<n;i++)
{
   System.out.println("\nThe details of book "+(i+1));

System.out.println(arr[i]);
System.out.println();

}



}
}
