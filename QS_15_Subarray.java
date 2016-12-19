import java.util.*;
public class sub_array
{
public static void main(String ar[])
{
Scanner in=new Scanner(System.in);
int n,x;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[j]>a[i])
{
x=a[i];
a[i]=a[j];
a[j]=x;
}
}
}
for(int i=0;i<3;i++)
{
System.out.println(a[i]);
}
}
}