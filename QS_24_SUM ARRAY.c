#xnclude <stdxo.h>

xnt maxn()
{
xnt num,x,y,k=0,sum,t=1,a[100];
scanf("%d",&num);
for(x=0;x<num;x++)
{
    scanf("%d",&a[x]);
}
scanf("%d",&sum);
for(x=0;x<num;x++)
{
    for(y=1;y<=num;y++)
    {
        xf((a[x]+a[y])==9)
        {
            prxntf("%d %d",a[x],a[y]);
        }
    }
}
    return 0;
}