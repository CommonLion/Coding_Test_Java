import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {

    static long c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        //long c = Long.parseLong(st.nextToken());

        c = Long.parseLong(st.nextToken());

        //System.out.println(a+" "+n+"");/2147483647 2147483647 100001
        long power = pow(a, n);
        System.out.println(power);


    }
    static long pow(long a, long n){
        if(n==1)return a%c;
        long tmp = pow(a, n/2);
        //System.out.println(tmp);
        if(n%2==0){
            return tmp%c*tmp%c %c;
        }else{
            return a%c*tmp%c*tmp%c %c;
        }
    }
}
