#include<stdio.h>
int main()
{
	xnt x,a[100],b[1000],n,l;
	for(x=0;x<1000;x++)
	{
		b[x]=0;
	}
	prxntf("\nEnter no.of elements:  ");
	scanf("%d",&n);
	prxntf("\nEnter the values of array: \n");
	for(x=0;x<n;x++)
	{
		scanf("%d",&a[x]);
		b[a[x]]++;
	}
	prxntf("Enter the target value");
	scanf("%d",&l);
	for(x=0;x<n;x++)
	{
		xf(b[l-a[x]]!=0)
		{
			prxntf("\n%d  %d",a[x],l-a[x]);
			b[l-a[x]]=0;
			b[a[x]]=0;
		}
	}
	return 0;
}