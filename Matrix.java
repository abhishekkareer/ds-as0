import java.lang.*;
import java.util.*;
import java.io.*;
class Matrix
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner(System.in);
    System.out.print("enter the data");
    int a=ss.nextInt();
    int b=ss.nextInt();
    int c[][]=new int [a][b];
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<b;j++)
      {
        c[i][j]=ss.nextInt();
      }
    }
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<b;j++)
      {
        System.out.print(c[i][j]+"");
      }
    }
  }
}