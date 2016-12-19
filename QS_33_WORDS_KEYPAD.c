#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char one='',two[]={'a','b','c'},three[]={'d','e','f'},four[]={'g','h','i'},five[]={'j','k','l'},six[]={'m','n','o'},seven[]={'p','q','r','s'},eight[]={'t','u','v'},nine[]={'w','x','y','z'};
char in[2],tem[5],tem1[5];
int size,size1;
printf("enter the two numbers one by one");
scanf("%c\n",&in[0]);
scanf("%c",&in[1]);
switch (in[0])
{
case 1:
{
tem=one;
}
break;
case 2:
{
tem=two;
}
break;
case 3:
{
tem=three;
}
break;
case 4:
{
tem=four;
}
break;
case 5:
{
tem=five;
}
break;
case 6:
{
tem=six;
}
break;
case 7:
{
tem=seven;
}
break;
case 8:
{
tem=eight;
}
break;
case 9:
{
tem=nine;
}
break;
}
switch (in[1])
{
case 1:
{
tem1=one;
}
break;
case 2:
{
tem1=two;
}
break;
case 3:
{
tem1=three;
}
break;
case 4:
{
tem1=four;
}
break;
case 5:
{
tem1=five;
}
break;
case 6:
{
tem1=six;
}
break;
case 7:
{
tem1=seven;
}
break;
case 8:
{
tem1=eight;
}
break;
case 9:
{
tem1=nine;
}
break;
}
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
printf("%c%c",tem[i],tem1[j]);
}
}
print("above are the two letter combos");
size=strlen(tem);
size1=strlen(tem1);
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
loc=(J+1)%size1;
printf("%c%c%c",tem[i]tem1[j],tem1[loc]);
}
}
getch();
}
