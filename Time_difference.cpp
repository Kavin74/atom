#include<iostream.h>
{
  int main()
  {
    int hr1,min1,hr2,min2;
    float minutes;
    cout<<"Input Start Time Hr,Min :\n";
    cin>>hr1>>min1;
    cout<<"Input Stop Time Hr,Min :\n";
    cin>>hr2>>min2;
    minutes=(hr2*60+min2)-(hr1*60+min1);
    cout<<"Minutes Difference b/w "<<hr1<<":"<<min1<<" & "<<hr2<<":"<<min2<<" is : "<<minutes;
  }
