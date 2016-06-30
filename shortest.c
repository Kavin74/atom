#include<stdio.h>
#include<math.h>
int main()
{
  int h,l,w,p;
  float s;
  printf("Enter the length");
  scanf("%d",&l);
  printf("\nEnter the width");
  scanf("%d",&w);
  printf("\nEnter the height");
 scanf("%d",&h);
  p=l*l+w*w; 
  s=sqrt(p)+h;
  printf("\nThe Shortest distance is %3.2f",s);
  return 0;
}
