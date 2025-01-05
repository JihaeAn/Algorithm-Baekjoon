package baekjoon.level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2903 {
    public static void main(String[] args) throws IOException {
        int dot = 2;
        int plus = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dot = dot + plus;
            } else {
                plus = plus * 2;
                dot = dot + plus;
            }
        }

        System.out.println(dot * dot);
    }
}
