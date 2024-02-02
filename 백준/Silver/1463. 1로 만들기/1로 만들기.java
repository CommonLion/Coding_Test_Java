import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1]; // dp 배열 선언

        // Bottom-up 방식으로 DP 테이블 채우기
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // 현재 수에서 1을 뺀 경우의 연산 횟수

            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누는 경우
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누는 경우
        }

        System.out.println(dp[n]); // 결과 출력
    }
}
