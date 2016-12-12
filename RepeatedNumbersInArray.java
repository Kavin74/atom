import java.io.*;
import java.util.*;
class RepeatedNumbersInArray
{
	public static void main(String args[])
	{
  		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  		int arr = new int [20];
  		int N=args.lenth
  		for(int i=0;i<=N;i++)
  			arr[i]=in.nextInt;
  		for(i=0;i<=N-1;i++)
  			for(int j=i+1;j<=N;j++)
  			{
  				if(arr[i]==arr[j])
  					System.out.println(arr[i]);
  			}
  	}
  }	
 
