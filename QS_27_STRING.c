#include<stdio.h>
#include<conio.h>
void main()
{
char str[7]="aabbbcd";
int i=0,j,k=0;
clrscr();
while(k<7)
{
if(str[i]==str[i+1])
i++;
else
{
str[k]=str[i];
i++;
k++;
}
}
for(j=0;j<k;j++)
{
printf("%c",str[j]);
}
getch();
}