package baekjoon.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_3003_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(1 - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(1 - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(2 - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(2 - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(2 - Integer.parseInt(st.nextToken())).append(" ");
        sb.append(8 - Integer.parseInt(st.nextToken())).append(" ");

        System.out.println(sb);
    }
}
