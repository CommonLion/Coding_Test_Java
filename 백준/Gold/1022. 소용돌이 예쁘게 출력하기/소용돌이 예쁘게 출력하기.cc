#include <stdio.h>

int y(int r, int po){//가로줄나누기
     int y;
    y=(po-r);//r2 c1 은 0 0인데 r2가 홀수면 
    return y;
    
}//y는c

int x(int c, int po){
    int x;
    x=(po-c);//x=(po-c)
    return x;
}




int main(){
    int r1, c1, r2, c2;
    //int e, r, u, o;
    scanf("%d %d", &r1, &c1);
    scanf("%d %d", &r2, &c2);
     
    
    
    int arr[50][5];
    
    //if(y(ta, c1)<=c&&c<=y(ta, c2)&&x(ta, r1)<=f&&f<=x(ta, r2))printf("%d", d);
    //c위로 f오른쪽
    int b=2;
    int c=0;//y
    int d=1;//값
    int f=0;//x
    int oo=0;
    int num;
    //이값은 ㅅ1ㅅ2ㅊ1ㅊ2와 호환 가능 이거랑 arr이 [][]랑 합치는 수식 생성
    //cf이용해서 진짜 위치 구함....
    
    
    
for(int t=0;d<100000000;t++){
    
    if(d==1){
        if(c1<=f&&f<=c2&&r1<=c&&c<=r2){
            arr[y(c, r2)][x(f, c2)]=d;
        }
    }
    
    
    f++;
    d++;
       if(c1<=f&&f<=c2&&r1<=c&&c<=r2){
            arr[y(c, r2)][x(f, c2)]=d;
        }
        
    for(int i=0;i<b-1;i++){//c--
        d++;
        c--;
        if(c1<=f&&f<=c2&&r1<=c&&c<=r2){
            arr[y(c, r2)][x(f, c2)]=d;
    }
    
    }
    for(int i=0;i<b;i++){//f--
        d++;
        f--;
        if(c1<=f&&f<=c2&&r1<=c&&c<=r2){
            arr[y(c, r2)][x(f, c2)]=d; //printf("%d %d %d\n", f, c1, x(f, c1));
        }
    }
    for(int i=0;i<b;i++){//c++
        c++;
        d++;
        if(c1<=f&&f<=c2&&r1<=c&&c<=r2){
            arr[y(c, r2)][x(f, c2)]=d;
    }
    }
    
    for(int i=0;i<b;i++){//f++
        d++;
        f++;
        if(c1<=f&&f<=c2&&r1<=c&&c<=r2){
            arr[y(c, r2)][x(f, c2)]=d;
            
    }
    }
    //if(c1<=c&&c<=c2&&r1<=f&&f<=r2)printf("%d", d);
    
    
 //printf("%d %d %d\n", c, f, d);
    b+=2;
    
    //if(m==r2-r1&&n==c2-c1+1)break;
    
}
    //for로 일정 범위가 되면 초기화 시작....
    //끝나는 지점에서 break왼쪽위인지 오른쪽 아래인지
    
    
    
    
    
    //r2 c2가 더커야함....
    
    
    
    
    //printf("%d\n", c2-c1);
    
   
    
    
    
    for(int j=r2-r1;j>=0;j--){
        for(int i=0;i<=c2-c1;i++){
            num=arr[j][i];
            if(num>=oo)oo=num;
        }
    }
    
    
    if(oo>=1000000000){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%10d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else if(oo>=100000000){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%9d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else if(oo>=10000000){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%8d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else if(oo>=1000000){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%7d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else if(oo>=100000){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%6d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else if(oo>=10000){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%5d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else if(oo>=1000){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%4d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else if(oo>=100){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%3d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else if(oo>=10){
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%2d ", arr[j][i]);
        }
        printf("\n");
      }
    }
	else {
        for(int j=r2-r1;j>=0;j--){
        for(int i=c2-c1;i>=0;i--){
        printf("%d ", arr[j][i]);
        }
        printf("\n");
      }
    }
    
    
    
    
    
    
    
    
   // printf("%2d ", arr[0][2]);
    
    
    
}





//일단 했고 
//띄어쓰기랑 -
//
//*** stack smashing detected ***: <unknown> terminated
//Command terminated by signal 6 ???
//r1 r2값이 변하면 문제 가 생기는 듯...이거임