#include<stdio.h>
int main()
{
    int n,i;
    //scanf("%d",&n);
    int a[]={5,3,1,7,2};
    //for(i=0;i<n;i++)
      //  scanf("%d",&a[i]);
    
    int si=0;
    int j=1;
    while(si<5)
    {
        if(a[si]>a[j])
        {
            for(int k=j-1;k>=0;k--)
            {
                if(a[j]>a[k])
                {
                    int t=a[j];
                    a[j]=a[k];
                    a[k]=t;
                }
    
            }
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }
    return 0;
}
