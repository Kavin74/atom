import java.io.*;
import java.util.Scanner;
class SET1(4)_UniqueInteger
	public static void main(String args[])
	{
  		Scanner in = new Scanner());
  		int arr = new int [20];
  		int num;
  		int N=args.lenth   //Dyanamic Array Size
  		for(int i=0;i<=N;i++)
  			arr[i]=in.nextInt;  //Geting Array Values
  		java.util.Array.Sort(arr[]);
  		while(i<N-1)
  		{	
  			j=i+1
  			while(j<N)
  			{
  				if(arr[i]!=arr[j])
  				{
  						System.out.println(arr[i]);
  						i+=1;
  						j+=1;
 				}
 				else
 				{
 						i+=2;
 						j+=2;
 				}
  			}
  		}
  	}
  }	
