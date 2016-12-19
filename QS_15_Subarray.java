import java.util.*;
public class QS_15_Subarray
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int num,x;
num=in.nextInt();
int a[]=new int[n];
for(int i=0;i<num;i++)
{
a[i]=in.nextInt();
}
for(int i=0;i<num-1;i++)
{
for(int j=i+1;j<num;j++)
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
