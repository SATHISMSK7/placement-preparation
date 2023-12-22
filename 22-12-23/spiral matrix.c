#include <stdio.h>

int main()
{
    int n,i,j;
    scanf("%d",&n);
    int r=n*2-1,c=n*2-1;
    
    int a[r][c];
    
    int sr=0,er=r-1,sc=0,ec=c-1;
    
    while(sr<=er && sc<=ec)
    {
        for(i=sc;i<=ec;i++)
        {
            a[sr][i]=n;
           
        }
        sr++;
        for(i=sr;i<=er;i++)
        {
            a[i][ec]=n;
          
        }
        ec--;
        for(i=ec;i>=sc;i--)
        {
            a[er][i]=n;
            
        }
        er--;
        for(i=er;i>=sr;i--)
        {
            a[i][sc]=n;
            
        }
        sc++;
        n--;
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<r;j++)
        {
            printf("%d",a[i][j]);
        }
        printf("\n");
    }
    return 0;
}

