package baekjoon.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_10871_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 첫째 줄
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        //둘째 줄
        st = new StringTokenizer(br.readLine());

        int per;
        for (int i = 0; i < N; i++) {
            per = Integer.parseInt(st.nextToken());
            if (per < x) sb.append(per).append(" ");
        }
        System.out.println(sb);
    }
}
