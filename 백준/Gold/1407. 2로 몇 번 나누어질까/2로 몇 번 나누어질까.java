import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long i = a;
        long sum=0;

        sum = two(b)- two(a-1);

        System.out.println(sum);
    }
    static <list> long two(long x){
        long count=0;
        long sum=0;
        long size=0;
        long xx=x;

        ArrayList<Long> list = new ArrayList<>();
        if(x==0) return 0;
        if(x==1)return 1;

        while(xx!=1){
            xx/=2;
            size++;
        }
        long []arr = new long[(int)size+1];
        //System.out.println("size"+size);
        int z=0;
        arr[0]=x;
        list.add(1L);
        for (long i = 2; i <= x; i<<=1){
            z++;
            count = x/i;
            arr[z]=count;
            list.add(i);
        }
        count = 0;
        long temp=0;

        for (int i = (int)size; i >= 0; i--) {
            temp = arr[i] - count;
            count += temp;
            sum += temp*list.get(i);

        }

        return sum;
    }

    static long pow(long a, long n){
        if (n == 0) return 1;
        if(n==1)return a;
        long tmp = pow(a, n/2);
        if(n%2==0){
            return tmp*tmp;
        }else{
            return a*tmp*tmp;
        }
    }
}
