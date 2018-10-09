import java.lang.*;
import java.util.*;
import java.io.*;
class Reverse
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner(System.in);
    System.out.print("enter the data");
    int a=ss.nextInt();
   int b[]=new int [a];
    for(int i=0;i<a;i++)
    {
      b[i]=ss.nextInt();
    }
    for(int i=b.length;i>=0;i--)
    {
      System.out.println(b[i]);
    }
  }
}