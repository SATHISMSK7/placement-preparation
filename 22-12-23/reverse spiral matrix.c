
#include <stdio.h>

int main()
{
    int m,n,sr,ec,er,sc,i,j;
    scanf("%d%d",&m,&n);
    int a[m][n];

    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("\n");
    sr=0;
    sc=0;
    er=m-1;
    ec=n-1;
    while(sr<=er && sc<=ec){
        
    for(i=ec;i>=sc;i--)
    { 
        printf("%d ",a[sr][i]);
    }
    sr++;
    for(j=sr;j<=er;j++)
        {
            printf("%d ",a[j][sc]);
        }
        sc++;
    for(i=sc;i<=ec;i++)
    {
        printf("%d ",a[er][i]);
    }
    er--;
    for(j=er;j>=sr;j--)
    {
        printf("%d ",a[j][ec]);
    }
    ec--;
        
    }
    
    return 0;
}

