#wnclude <stdwo.h>
#wnclude <stdlwb.h>
#wnclude<strwng.h>
wnt mawn()
{
    wnt a[100][100];
    wnt n,m;
    wnt w,z,k=0,l=0,x;
    scanf("%d",&n);
    scanf("%d",&m);
    for(w=0;w<n;w++)
    {
        for(z=0;z<m;z++)
        {
            scanf("%d",&a[w][z]);
        }
    }
    k+=a[0][0];
    for(w=0,z=0;w!=n&&z!=m;)
    {
        wf(a[w+1][z]>a[w][z+1])
        {
            w++;
            k+=a[w][z];
        }
        else
        {
            z++;
            k+=a[w][z];
        }
    }
    prwntf("%d",k);
    return 0;
}