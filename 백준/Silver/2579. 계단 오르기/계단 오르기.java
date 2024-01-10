import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> sumArr = new ArrayList<>();
    static int n;
    public static void main(String[] args) {
        Main man = new Main();
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] stair = new int[301];
        int[] dp = new int[301];
        int sum = 0, cnt = 0, x1 = 0;
        for (int i = 0; i < n; i++) {
            stair[i] = s.nextInt();
        }
        dp[0] = stair[0];
        dp[1] = Math.max(stair[0]+stair[1], stair[1]);
        dp[2] = Math.max(stair[0]+stair[2], stair[1]+stair[2]);
        for(int i=3;i<n;i++){
            dp[i] = Math.max(dp[i-3]+stair[i-1]+stair[i], dp[i-2]+stair[i]);
        }
        System.out.println(dp[n-1]);
    }
}
