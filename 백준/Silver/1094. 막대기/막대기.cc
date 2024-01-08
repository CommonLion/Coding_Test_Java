#include<stdio.h>

int main() {
    int a, m;
    int t[7]={1, 1, 1, 1, 1, 1, 1};
    int sum=0;;
    int s=2;
    scanf("%d", &a);
    //t[0]=1;
    for(int i=0;i<7;i++){
        
        for(int m=0;m<i;m++){
        t[i]*=2;
        
        }
       
    }
    
    
    for(int i=6;i>0;i--){
        
        
        
        if(t[i-1]<=a&&a<=t[i]){
            
            
            
            if(a==t[i]||a==t[i-1]){
                s=1;
                
                
            }
            
            else {
            sum=t[i-1];
            m=i-2;
            
            while(sum>0&&m>0){
               
                
                
                if(a<sum+t[m]){m--;}     //i-2>=0
                else if(a>sum+t[m]){
                    sum+=t[m];
                    s++;
                    
                    m--;
                }
                else {break;}
                
                
                
                  
                    
                
                
               
            }
            }
            
            
            
            
            
        }
        
         
        
    }
        
    
    
    
    printf("%d\n", s);
    
   
    
}