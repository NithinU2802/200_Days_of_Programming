/******************************************************************************

Invert every two integer from last....

Input:
7639

Output:
6793


Input:
73639

Output:
76393


*******************************************************************************/

#include <stdio.h>

int rev(int a){
    int s=0;
    while(a>0){
        s=(s*10)+(a%10);
        a/=10;
    }
    return s;
}

int main()
{
    int n;
    scanf("%d",&n);
    int m=0,t;
    while(n>0){
        t=n%10;
        n/=10;
        if(n==0){ 
            m=((m*10)+t);
            break;
        }
        m=((m*10)+n%10);
        m=((m*10)+t);
        n/=10;
    }
    printf("%d",rev(m));
    return 0;
}
