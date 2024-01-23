import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main man = new Main();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer sb = new StringTokenizer(bf.readLine());
        int n= Integer.parseInt(sb.nextToken());
        int m = Integer.parseInt(sb.nextToken());
        int b =  Integer.parseInt(sb.nextToken());
        int [][]arr = new int[n][m];
        int inven;
/*
        for (int i = 0; i < n; i++) {
            sb = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(sb.nextToken());
            }
        }
        bf.close();
        int max = man.findMax(arr, n, m);
        int min = man.findMin(arr, n, m);


        */
        int min = 256;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sb = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(sb.nextToken());
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        //Map<Integer, Integer> map = new HashMap<>();
        int key = 0, value=0;
        int time_bound = 1000000000;
        int high_bound = 0;
        int cnt =0;

        Loop1 :
        for (int z = min; z <= max; z++) { //y축
            inven = b;
            key=0;
            //if(man.checkCnt(arr,n,m,z,inven))continue;
            Loop2 :
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(arr[i][j]>z){ //내려가는 경우
                        inven += arr[i][j]-z;
                        key += (arr[i][j]-z)*2;
                    }else if(arr[i][j]<z){//올라가는 경우wj
                        inven -= z-arr[i][j];
                        key += z-arr[i][j];
                    }
                }
            }
            if(inven<0){
                continue Loop1;
            }
            if(key<=time_bound && high_bound<=z){ //높이에 대한 조건 확인은 중복때문에
                time_bound=key;
                high_bound=z;
            }


            //System.out.println(inven+"||"+key+"++"+z+"||"+cnt);
            //System.out.println("hi:"+bound);
            //map.put(key,z);
           // bound=key;
        }



        ///음 key값이 중복되는 경우 처리
        // 일단 key값으로 거를 수 있는 제약 조건을 하나 더 만들어야됨.....
        // 지금 존재하는 키보다 작다면
        //System.out.println(map);
        //System.out.println(t+" "+map.get(t));

        //int t = Collections.min(map.keySet());
        //bw.write(t+" "+map.get(t));
        //bw.write(t+" "+map.get(t));
        bw.write(time_bound+" "+high_bound);
        bw.flush();
        bw.close();
    }
/*
    int findMax(int arr[][], int n, int m){
        int max=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]>max)max = arr[i][j];
            }
        }

        return max;
    }
*/
    /*
    int findMin(int arr[][], int n, int m){
        int min=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]<min)min = arr[i][j];
            }
        }
        return min;
    }
    */

    int upBlock(){

        return -1;

    }
    int downBlock(){

        return 1;
    }

    boolean checkCnt(int arr[][], int n, int m,int high, int inven) { //인벤토리랑 얼만나 필요한지
        //필요한 블럭을 비교하는 거임..
        int z = 0;
        int inv_z=inven;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(high<arr[i][j]){ //내려가야됨.
                    inv_z+=arr[i][j]-high;
                }else if(high>arr[i][j]){
                    z+=high-arr[i][j];
                }
            }
        }
        return inv_z<z;
    }


}
