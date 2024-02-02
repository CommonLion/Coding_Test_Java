import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//바텀업 방식
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        
        for (int i = 2; i <= n; i++) {
            /*1감소연산 먼저*/
            dp[i] = dp[i - 1] + 1; 

            /*2와 3을 나눈 케이스를 각각 구함. 같은 i의 최솟값을 구하는 연산 포함*/
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1); 
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1); 
        }
        System.out.println(dp[n]); 
    }
}
