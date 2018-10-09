import java.lang.*;
import java.io.*;
import java.util.*;
class Maxval
{
  public static void main(String [] aa)
  {
    int max=0;
    Scanner ss=new Scanner(System.in);
    int a=ss.nextInt();
    int b[]=new int [a];
    for(int i=0;i<a;i++)
    {
      int q=ss.nextInt();
      b[i]=q;
    }
    for(int j=0;j<a;j++)
    {
      if(b[j]>max)
      {
        max=b[j];
      }
    }
    System.out.println("max val:-"+max);
  }
}