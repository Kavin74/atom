#include<stdio.h>
int main()
{
	int m,n,i,j,temp;
	scanf("%d",&m);
	scanf("%d",&n);
	int *row_list=new int[m];
	int *column_list=new int[n];
	for(i=0;i<m;i++)
	row_list[i]=1;
	for(j=0;j<n;j++)
	column_list[j]=1;
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&temp);
			if(temp==0)
			{
			  row_list[i]=0;
			  column_list[j]=0;	
			}			
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
	     if(row_list[i]==1 &&column_list[j]==1)	
	     printf("1 ");
	     else
	     printf("0 ");
	    }
	    printf("\n");
    }	 
	return 0;
}_