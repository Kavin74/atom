import java.io.*;
public class Permutation
{
 public int fact(int num)
  {
    int fact=1;
    for(i=1;i<=num;i++)
    { 
      fact*=i;
    }
  }
 public static void main(String args)
 {
   int n,r;
   Scanner in = new Scanner(System.in);
   System.out.println("Input n : ");
   n=in.nextInt();
   System.out.println("Input r : ");
   r=in.nextInt();
   x=(int)fact(n);
   y=(int)fact(n-r);
   System.out.println("Permutation is "+(x/y));
  }
 }
  
