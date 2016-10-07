#include<iostream.h>
char check(char string)
{
    if(string=="sunday"||string=="SUNDAY") return FALSE;
    else return TRUE;
 }
    
void main()
{
   char str[15];
   cout<<"Input the day : \n";
   cin>>str;
   result=check(str);
   cout<<result;
   getch();
 }
