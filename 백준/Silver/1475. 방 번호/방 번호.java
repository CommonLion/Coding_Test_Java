import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] arr;
        arr = st.nextToken().toCharArray();
        int []num = new int[10];
        int c;
        for (int i = 0; i < arr.length; i++) {
            c= arr[i]-'0';
            num[c]++;
        }

        num[6]+=num[9];
        if(num[6]%2!=0){
            num[6] = (num[6])/2+1;
        }
        else num[6] = (num[6])/2;

        int max = 0;
        for (int i = 0; i < 9; i++) {
            if(max<num[i])max=num[i];
        }
        System.out.println(max);

    }
}
