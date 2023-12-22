
#include <stdio.h>

int main()
{
      int i,j,a,b,temp;
    char str[20];
    
    scanf("%[^\n]s",str);
    for (i=0;str[i]!='\0';i++)
    {
        for (j=i+1;str[j]!='\0';j++)
        {
            a=str[i];
            b=str[j];
            //printf("%d %d",a,b);
            if(str[i]>str[j])
            {
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
            
        }
        
    }
    printf("%s",str);
        
        
    

    return 0;
}


