import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> list = new LinkedHashMap<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String text = bf.readLine();
            if(text.length()<length)continue;
            if(list.get(text)!=null){
                list.put(text, (list.get(text)+1));
            }else list.put(text, 1);
        }
        bf.close();
        
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(list.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int valueCompare = o2.getValue().compareTo(o1.getValue());
                if (valueCompare == 0) {
                    int lengthCompare = Integer.compare(o2.getKey().length(), o1.getKey().length());
                    if (lengthCompare == 0) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    return lengthCompare;
                }
                return valueCompare;
            }
        });

//        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(list.entrySet());
//        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                int valueCompare = o2.getValue().compareTo(o1.getValue());
//                if (valueCompare != 0) {
//                    return valueCompare;
//                }
//                int lengthCompare = Integer.compare(o2.getKey().length(), o1.getKey().length());
//                if (lengthCompare != 0) {
//                    return lengthCompare;
//                }
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        });
        
        for(Map.Entry<String, Integer> entry : entryList){
            bw.write(entry.getKey());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
