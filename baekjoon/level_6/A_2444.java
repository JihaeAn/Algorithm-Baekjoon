package baekjoon.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 위쪽
        for (int i = 1; i <= n; i++) {
            // 공백
            for (int j = 1; j <= n - i; j++) {
                sb.append(" ");
            }
            // 별
            for (int j = 1; j <= i * 2 - 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        // 아랫쪽
        for (int i = n - 1; i >= 1; i--) {
            // 공백
            for (int j = 1; j <= n - i; j++) {
                sb.append(" ");
            }
            // 별
            for (int j = 1; j <= i * 2 - 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
