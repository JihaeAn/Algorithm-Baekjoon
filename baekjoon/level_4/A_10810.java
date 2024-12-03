package baekjoon.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 첫째 줄
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 장바구니 갯수
        int M = Integer.parseInt(st.nextToken()); // 공 넣을 횟수

        int[] list = new int[N];

        // 나머지 줄
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int number = Integer.parseInt(st.nextToken());

            for (int j = start; j <= end; j++) {
                list[j] = number;
            }
        }
        for (int i = 0; i < N; i++) {
            sb.append(list[i]);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
