import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static boolean[][] visit;
    static int count;
    static int vx, vy;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int testCase = Integer.parseInt(st.nextToken());

        Main man = new Main();

        for (int j = 0; j < testCase; j++) {
            count = 0;
            st = new StringTokenizer(bf.readLine());
            vx = Integer.parseInt(st.nextToken());
            vy = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            arr = new int[vx][vy]; //x나 y중에 하나가 같고 하나가 연속된 수라면 그것을 인접하다고 말할 수 있다.
            visit = new boolean[vx][vy];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1; //인접 노드 있는지 확인 // 배추가 심어진 곳 확인.
            }


            for (int i = 0; i < vx; i++) {
                for (int k = 0; k < vy; k++) {
                    if (arr[i][k] == 1 && !visit[i][k]) {
                        man.dfs(i, k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }

    public void dfs(int x, int y) { //x만큼 반복하는 중
        //시작인 정점을 vx, vy라고 선언하고 부터 시작하면 시간도 줄고 시작임을 나타낼수 있을 듯
        //  //해당 노드를 방문 처리하고,

        if (arr[x][y] == 1 && !visit[x][y]) {
            visit[x][y] = true;
            //System.out.println(x + " " + y);

            if (x + 1 < vx) {
                if (arr[x + 1][y] == 1 && !visit[x + 1][y]) { //아래로 한칸 인접하면
                    //System.out.println("오른쪽 이동");
                    dfs(x + 1, y);
                }
            }
            if (x - 1 >= 0) {
                if (arr[x - 1][y] == 1 && !visit[x - 1][y]) { //아래로 한칸 인접하면
                    //System.out.println("왼쪽 이동");
                    dfs(x - 1, y);
                }
            }
            if (y + 1 < vy) {
                if (arr[x][y + 1] == 1 && !visit[x][y + 1]) { //아래로 한칸 인접하면
                    //System.out.println("위 이동");
                    dfs(x, y + 1);
                }
            }
            if (y - 1 >= 0) {
                if (arr[x][y - 1] == 1 && !visit[x][y - 1]) { //아래로 한칸 인접하면
                    //System.out.println("아래 이동");
                    dfs(x, y - 1);
                }
            }
        }
    }
}

