#include<stdio.h>
main()
{
int n1,n2,i,j,rem,c=0,c=0;
scanf("%d%d",&n1,&n2);
for(i=n1;i<=n2;i++)
{
c=0;
int t=i;
while(t!=0)
{
rem=t%2;
t=t/2;
if(rem==1)
c++;
}

printf("\n%d",c);
int flag=0;
for(j=2;j<c/2;j++)
{
if(c%j==0)
{
flag=1;
}
}
if(flag==0&&c!=1)
c++;
}
printf("\nc=%d",c);
}