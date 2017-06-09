import java.io.*;
import java.util.*;
class Lar
{
 public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("enter the 3 input:");
 int a=s.nextInt();
 int b=s.nextInt();
 int c=s.nextInt();
 if(a>=b && a>=c)
{
System.out.println("The largest num is"+" "+a);
}
else if(b>=a && b>=c) 
{
System.out.println("The largest num is"+" "+b);
}
else
{
System.out.println("The largest num is"+" "+c);
}
}
}
