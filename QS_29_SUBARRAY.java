import java.util.Arrays;
import java.util.Scanner;

public class subarray {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int p=sc.nextInt();
		int a[]=new int[10];
		for (int i = 0; i <p; i++) {
			a[i]=sc.nextInt();
			
		}
		Arrays.sort(a);
		int s=a.length-1;
		for(int i=0;i<n;i++)
		{
			sum+=a[s];
			s--;
		}
		System.out.println(sum);
		
	}

}