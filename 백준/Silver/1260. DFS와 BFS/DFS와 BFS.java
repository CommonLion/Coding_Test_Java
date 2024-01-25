import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[] visit;
    static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        map = new int[n+1][n+1];//1부터 시작이니까
        visit = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b]=map[b][a]=1;//간선이 존재하는 것을 표기
        }

        dfs(v);
        System.out.println();
        visit = new boolean[n+1]; //visit초기화 하기

        bfs(v);


    }

    public static void dfs(int i){
        // dfs, 재귀, 인접 행렬, i 정점부터 시작한다.
        visit[i] = true; // 노드 중복 접근 방지를 위한 방문 체크 배열. (boolean)
        System.out.print(i+ " ");

        for (int j = 0; j < n+1; j++) {
            if (map[i][j] == 1 && !visit[j]){
                dfs(j);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start); //add랑 같음.
        visit[start] = true; // 노드의 중복 접근 방지를 위한 방문 체크 배열.(boolean)
        //비어있는지 확인
        while (!q.isEmpty()){
            int temp = q.poll(); // 큐를
            System.out.print(temp+" ");
            for (int j = 0; j < n+1; j++) {
                if (map[temp][j]==1 && !visit[j]){ //간선이 존재하고, 방문하지 않았다면 큐에 추가하고 방문처리
                    q.offer(j);
                    visit[j] = true;
                }
            }
        }
    }

}
