import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((Integer.parseInt(bf.readLine())));
        }
        Collections.sort(list);
        Collections.reverse(list);
        int sum = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                if(list.get(i) < list.get(j)+list.get(j+1)){
                    sum = list.get(i)+list.get(j)+list.get(j+1);
                    break;
                }
            }
            if(sum!=0)break;
        }
        if(sum==0)sum=-1;
        System.out.println(sum);





    }
}
