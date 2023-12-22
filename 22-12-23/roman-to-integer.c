#include <stdio.h>
#include<string.h>

int main()
{
    int sum=0,i,j,bef,aft;
    char c[100];
    scanf("%s",c);
    int a[7]={1,5,10,50,100,500,1000};
    char b[7]={'I','V','X','L','C','D','M'};
    for(i=0;i<strlen(c);i++)
     {
         int n=i+1;
        if((c[i]=='I' && c[n]=='V') || (c[i]=='I' && c[n]=='X') || (c[i]=='X' && c[n]=='L' )|| (c[i]=='X' && c[n]=='C') ||( c[i]=='C' && c[n]=='D') ||( c[i]=='C' && c[n]=='M')){
        for(j=0;j<7;j++)
        {
            
            if(c[i+1]==b[j])
            {
                bef=a[j];
                //printf("\n%d",bef);
                
            }
        }
        for(j=0;j<7;j++)
            if(c[i]==b[j])
            {
                aft=a[j];
                //printf("\n%d",aft);
               
                
            }
            
            
        
         i++;
        sum+=bef-aft;
        }
        else
        {
             for( j=0;j<7;j++)
        {
            
            if(c[i]==b[j])
            {
                sum+=a[j];
                
            }
        }
        
        }
     }
     printf("%d",sum);

    return 0;
}
