#include <stdio.h>

int main(){
    int x;
    int y = 1;
    scanf("%d",&x);
    int i = x;
    while(x>9){
        y*=10;
        i/=10;
    }
    printf("%d \n");

    printf("%d",i);

    printf("%d",x);

    
    // while (y>0)
    // {
    //    printf("%d",i); 
    //    y/=10;
    // }
    
}