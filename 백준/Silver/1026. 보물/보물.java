import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int []a;
        Integer []b;

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        a=new int[n];
        b=new Integer[n];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            b[i]=Integer.parseInt(st.nextToken());
        }

        int sum=0;

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder()); //int는 안되고 Integer만 가능

        for (int i = 0; i < n; i++) {
            sum+=a[i]*b[i];
        }
        System.out.println(sum);


    }
}
